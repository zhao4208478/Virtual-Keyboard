package com.example.socket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = ( Button ) findViewById( R.id.button ) ;
        button.setOnClickListener ( new OnClickListener() {			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				connectServer();
			}
		});
    }
    public void connectServer () {
    	String serverIp = "192.168.0.101" ;
    	try {
    	    Socket socket = new Socket( serverIp , 8877 ) ;
    	    DataInputStream din = new DataInputStream( socket.getInputStream() ) ;
    	    DataOutputStream dout = new DataOutputStream( socket.getOutputStream() ) ;
    	    EditText et = ( EditText ) this.findViewById( R.id.et ) ;
    	    String tempStr = et.getText().toString() ;
    	    dout.writeUTF( tempStr ) ;
    	    TextView tv = ( TextView ) this.findViewById( R.id.tv ) ;
    	    tv.setText( din.readUTF() ) ;
    	    din.close() ;
    	    dout.close() ;
    	    socket.close() ;
    	} catch ( Exception e ) {
    		e.printStackTrace() ;
    	}
    }
}
