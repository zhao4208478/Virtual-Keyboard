package com.example.socket2;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.UnknownHostException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.*;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   
    
    
    public boolean onTouchEvent(MotionEvent event){ 
    	int pointerCount = event.getPointerCount(); 
        int pointerIndex = (event.getAction() & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;
        int pointerId = event.getPointerId(pointerIndex);
        int action = (event.getAction()&MotionEvent.ACTION_MASK) % 5;//统一单点和多点 
			switch(action){ 
	           case MotionEvent.ACTION_DOWN:
	           {
	        	   float a1 = event.getX(pointerId);
        		   float b1 = event.getY(pointerId);
	        	   send(a1,b1);
	           }
		       break; 
		       case MotionEvent.ACTION_UP:
		       {
		    	   float a1 = event.getX(pointerId);
	        	   float b1 = event.getY(pointerId);
	        	   send(a1,b1);
	           }
		       break; 
			}
        return false; 
	} 
    
   public void send(float x ,float y)
   {
	   String[] number={"1","2","3","4","5","6","7","8","9","0","-","back"};
	   String[] letter1={"Q","W","E","R","T","Y","U","I","O","P","[","]"};
	   String[] letter2={"A","S","D","F","G","H","J","K","L","enter"};
	   String[] letter3={"shift","Z","X","C","V","B","N","M","I","O","P","shift"};
	   if ( ( y > 50 ) && ( y < 100 ) )
	   { 
		   try {
		          connecttoserver(number[ (int) x / 40 ]);
		         } catch (UnknownHostException e) {
		          e.printStackTrace();
		         } catch (IOException e) {
		          e.printStackTrace();
		         }
	   }
	   else
	   if ( ( y > 100 ) && ( y < 150 ) )
	   {
		   try {
		          connecttoserver(letter1[ (int) x / 40 ]);
		         } catch (UnknownHostException e) {
		          e.printStackTrace();
		         } catch (IOException e) {
		          e.printStackTrace();
		         }
	   }
	   else
	   if ( ( y > 150 ) && ( y < 200 ) )
	   {
		   try {
			   connecttoserver(letter2[ (int) x / 40 ]);
			   } catch (UnknownHostException e) {
			   e.printStackTrace();
			   } catch (IOException e) {
			   e.printStackTrace();
			   }
	   }
	   else
	   if ( ( y > 200 ) && ( y < 250 ) )
	   {
		   try {
			   connecttoserver(letter3[ (int) x / 40 ]);
			   } catch (UnknownHostException e) {
			   e.printStackTrace();
			   } catch (IOException e) {
			   e.printStackTrace();
			   }
	   }
	   else
	   {
		   try {
			   connecttoserver(" ");
			   } catch (UnknownHostException e) {
			   e.printStackTrace();
			   } catch (IOException e) {
			   e.printStackTrace();
			   }
	   }
   }
   public void connecttoserver(String string) throws UnknownHostException, IOException
{
    Socket socket=RequestSocket("192.168.1.200",5000);
   SendMsg(socket,string);     
}
    
    private Socket RequestSocket(String host,int port) throws UnknownHostException, IOException
    {   
    Socket socket = new Socket(host, port);
    return socket;
    }
    
    private void SendMsg(Socket socket,String string) throws IOException
    {
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    writer.write(string+"\n");
    writer.flush();
    }
}