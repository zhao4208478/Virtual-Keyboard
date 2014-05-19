package com.example.socket2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.example.socket2.R.id;

public class mouse extends Activity {
	private String tag = mouse.this.getClass().getSimpleName();
	public int start;
	public long TimeMillis1 = 0 ;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mouse);
        Button button=(Button)findViewById(id.Button2);
               button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent change = new Intent();
					change.setClass(mouse.this, MainActivity.class);
					startActivity(change);
					System.exit(0);  
				}
			});
    }   
	
	public boolean onTouchEvent(MotionEvent event){ 
    	int pointerCount = event.getPointerCount(); 
        int pointerIndex = (event.getAction() & MotionEvent.ACTION_POINTER_ID_MASK) >> MotionEvent.ACTION_POINTER_ID_SHIFT;
        int pointerId = event.getPointerId(pointerIndex);
        int action = (event.getAction()&MotionEvent.ACTION_MASK) % 5;//统一单点和多点 
			switch(action){ 
	        
			   case MotionEvent.ACTION_DOWN:
	           {
	        		   TimeMillis1 = System.currentTimeMillis();
		        	   start = 1;
		        	   float a1 = event.getX(pointerId);
	        		   float b1 = event.getY(pointerId);
		        	   send(a1,b1);
	           }
		       break; 
	           
			   case MotionEvent.ACTION_MOVE:
	           {
	        	   start = 2;
	        	   float a1 = event.getX(pointerId);
        		   float b1 = event.getY(pointerId);
	        	   send(a1,b1);
	           }
	           break;
		       
			   case MotionEvent.ACTION_UP:
		       {
	        	   long  TimeMillis2 = System.currentTimeMillis();
	        	   if ( ( TimeMillis2 - TimeMillis1 ) < 200 ){
	       			   Log.i(tag, "show:"+TimeMillis1+','+TimeMillis2);
	        		   try {
		        		   connecttoserver("click");
	     		         } catch (UnknownHostException e) {
	     		          e.printStackTrace();
	     		         } catch (IOException e) {
	     		          e.printStackTrace();
	     		         }
	        	   }
	        	   else {
		    	   start = 0;
		    	   float a1 = event.getX(pointerId);
	        	   float b1 = event.getY(pointerId);
	        	   send(a1,b1);
	        	   }
	           }
		       break; 
			}
        return false; 
	} 
    
   public void send(float x ,float y)
   {
	       String s=String.valueOf((int)x)+','+String.valueOf((int)y);
		   try {
			    if ( start == 1 )
			      connecttoserver('a'+s);
			    else if ( start == 0 )
		          connecttoserver('z'+s);
			    else 
			      connecttoserver('x'+s);
		         } catch (UnknownHostException e) {
		          e.printStackTrace();
		         } catch (IOException e) {
		          e.printStackTrace();
		         }
   }
   public void connecttoserver(String string) throws UnknownHostException, IOException
   {
	   Socket socket=RequestSocket("192.168.1.157",5000);
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
