package com.example.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.UnknownHostException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       

        findviews();
        setonclick();

    }

    private EditText chattxt;
    private TextView chattxt2;
    private Button chatok;
    
    public void findviews()
    {
        chattxt = (EditText)this.findViewById(R.id.chattxt);
        chattxt2 = (TextView)this.findViewById(R.id.chattxt2);
        chatok   = (Button)this.findViewById(R.id.chatOk);
    }
    
    private void setonclick()
    {
        chatok.setOnClickListener(new View.OnClickListener() {
   
    public void onClick(View v) {
     try {
      connecttoserver(chattxt.getText().toString());
     } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
     } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
     }
    }
   });
    }


    public void connecttoserver(String socketData) throws UnknownHostException, IOException
{
    Socket socket=RequestSocket("192.168.1.100",5000);
   SendMsg(socket,socketData);  
   String txt = ReceiveMsg(socket);
   this.chattxt2.setText(txt);    
}

    
    private Socket RequestSocket(String host,int port) throws UnknownHostException, IOException
    {   
    Socket socket = new Socket(host, port);
    return socket;
    }
    
    private void SendMsg(Socket socket,String msg) throws IOException
    {
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
   writer.write(msg.replace("\n", " ")+"\n");
   writer.flush();
    }
    
    private String ReceiveMsg(Socket socket) throws IOException
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
   String txt=reader.readLine();
   return txt ;
    }
}