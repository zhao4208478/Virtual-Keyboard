package com.example.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.UnknownHostException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button A;
    private Button B;
    private Button C;
    private Button D;
    private Button E;
    private Button F;
    private Button G;
    private Button H;
    private Button I;
    private Button J;
    private Button K;
    private Button L;
    private Button M;
    private Button N;
    private Button O;
    private Button P;
    private Button Q;
    private Button r;
    private Button S;
    private Button T;
    private Button U;
    private Button V;
    private Button W;
    private Button X;
    private Button Y;
    private Button Z;
    private Button kaca;
    private Button back;
    private Button shift1;
    private Button shift2;
    private Button enter;
    
    
    public void findviews()
    {
    	one = (Button)this.findViewById(R.id.one);
    	two = (Button)this.findViewById(R.id.two);
    	three = (Button)this.findViewById(R.id.three);
    	four = (Button)this.findViewById(R.id.four);
    	five = (Button)this.findViewById(R.id.five);
    	six = (Button)this.findViewById(R.id.six);
    	seven = (Button)this.findViewById(R.id.seven);
    	eight = (Button)this.findViewById(R.id.eight);
    	nine = (Button)this.findViewById(R.id.nine);
    	zero = (Button)this.findViewById(R.id.zero);
    	A = (Button)this.findViewById(R.id.A);
    	B = (Button)this.findViewById(R.id.B);
    	C = (Button)this.findViewById(R.id.C);
    	D = (Button)this.findViewById(R.id.D);
    	E = (Button)this.findViewById(R.id.E);
    	F = (Button)this.findViewById(R.id.F);
    	G = (Button)this.findViewById(R.id.G);
    	H = (Button)this.findViewById(R.id.H);
    	I = (Button)this.findViewById(R.id.I);
    	J = (Button)this.findViewById(R.id.J);
    	K = (Button)this.findViewById(R.id.K);
    	L = (Button)this.findViewById(R.id.L);
    	M = (Button)this.findViewById(R.id.M);
    	N = (Button)this.findViewById(R.id.N);
    	O = (Button)this.findViewById(R.id.O);
    	P = (Button)this.findViewById(R.id.P);
    	Q = (Button)this.findViewById(R.id.Q);
    	r = (Button)this.findViewById(R.id.r);
    	S = (Button)this.findViewById(R.id.S);
    	T = (Button)this.findViewById(R.id.T);
    	U = (Button)this.findViewById(R.id.U);
    	V = (Button)this.findViewById(R.id.V);
    	W = (Button)this.findViewById(R.id.W);
    	X = (Button)this.findViewById(R.id.X);
    	Y = (Button)this.findViewById(R.id.Y);
    	Z = (Button)this.findViewById(R.id.Z);
    	kaca = (Button)this.findViewById(R.id.kaca);
    	enter = (Button)this.findViewById(R.id.enter);
    	back = (Button)this.findViewById(R.id.back);
    	shift1 = (Button)this.findViewById(R.id.shift1);	
    	shift2 = (Button)this.findViewById(R.id.shift2);
    }
    
    
    public void setonclick()
    {  
    	
    int i;
    Button[] control={kaca,enter,back,shift1,shift2};
    final String[] massage={" ","enter","back","shift","shift"};
    for(i=0;i<=4;i++)
    {
    	final int k = i;
    	control[i].setOnTouchListener(new View.OnTouchListener() {
    	        public boolean onTouch(View v, MotionEvent event) 
    	        {
    	        	switch (event.getAction()) 
    	        	{ 
    	        	   case MotionEvent.ACTION_DOWN: 
    	        	   {
    	        	        try {
    	        	         connecttoserver(massage[k]);
    	        	        } catch (UnknownHostException e) {
    	        	         e.printStackTrace();
    	        	        } catch (IOException e) {
    	        	         e.printStackTrace();
    	        	        }
    	        	        setonclick();
    	        	        break;
    	        	   }
    	        	   case MotionEvent.ACTION_UP: 
    	        	   {
    	        	        try {
    	        	         connecttoserver(massage[k]);
    	        	        } catch (UnknownHostException e) {
    	        	         e.printStackTrace();
    	        	        } catch (IOException e) {
    	        	         e.printStackTrace();
    	        	        }
    	        	        break;
    	        	   }
    	        	} return true; 
    	        } 
    	       	});
    }
    Button[] number={zero,one,two,three,four,five,six,seven,eight,nine};
    for(i=0;i<=9;i++)
    {
    	final int k = i;
    	number[i].setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver(Integer.toString(k));
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	         break;
        	    }
        	    case MotionEvent.ACTION_UP: 
        	    {
        	         try {
        	          connecttoserver(Integer.toString(k));
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	         break;
        	    }
        		} return true; 
        	} 
        	});
    }
    Button[] letter={A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z};
    for(i=0;i<=25;i++)
    {
    	final char k = (char) (i+'A');
    	letter[i].setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver(String.valueOf(k));
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	         break;
        	    }
        	    case MotionEvent.ACTION_UP: 
        	    {
        	         try {
        	          connecttoserver( String.valueOf(k));
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	         break;
        	    }
        		} return true; 
        	} 
        	});
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