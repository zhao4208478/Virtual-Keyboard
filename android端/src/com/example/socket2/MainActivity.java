package com.example.socket2;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.UnknownHostException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.example.socket2.R.id;

import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.*;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	private String tag = MainActivity.this.getClass().getSimpleName();
	public String IP;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*	final EditText editText = new EditText(MainActivity.this);  
        new AlertDialog.Builder(this).setTitle("请输入PC端IP地址").setIcon(
        	     android.R.drawable.ic_dialog_info).setView(editText).setPositiveButton("确定",  new DialogInterface.OnClickListener() {

      	    	   public void onClick(DialogInterface dialog, int which) {
      	    	        IP = editText.getText().toString();
      	    	        Log.i(tag, "show:"+IP);
      	    	        Button button=(Button)findViewById(id.Button);
      	                button.setOnClickListener(new OnClickListener() {
      					
      					@Override
      					public void onClick(View v) {
      						// TODO Auto-generated method stub
      						Intent change = new Intent();
      						change.setClass(MainActivity.this, mouse.class);
      						startActivity(change);
      						System.exit(0);  
      					}
      				    });
      	    	        }
      	    	  })
        	     .setNegativeButton("取消", new DialogInterface.OnClickListener() {

        	    	   public void onClick(DialogInterface dialog, int which) {
        	    	    dialog.dismiss();
        	    	    MainActivity.this.finish();
        	    	   }
        	    	  }).show();*/
        Button button=(Button)findViewById(id.Button);
          button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent change = new Intent();
				change.setClass(MainActivity.this, mouse.class);
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
	   String[] letter2={"A","S","D","F","G","H","J","K","L","enter","enter","enter"};
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
	Log.i(tag, "show2:"+IP);
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