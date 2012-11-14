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

    private Button enter;
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
    }
    
    
    private void setonclick()
    {
    
    A.setOnClickListener(new View.OnClickListener() {  
    public void onClick(View v) {
     try {
      connecttoserver("A");
     } catch (UnknownHostException e) {
      e.printStackTrace();
     } catch (IOException e) {
      e.printStackTrace();
     }
    }
    });
        
    B.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("B");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    C.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("C");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    D.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("D");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    E.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("E");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    F.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("F");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    G.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("G");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    H.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("H");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    I.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("I");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    J.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("J");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    K.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("K");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    L.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("L");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    M.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("M");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    N.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("N");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    O.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("O");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    P.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("P");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    Q.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Q");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    r.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("R");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    S.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("S");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    T.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("T");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    U.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("U");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    V.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("V");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    W.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("W");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    X.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("X");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    Y.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Y");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    Z.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Z");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    kaca.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver(" ");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    enter.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("enter");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });
    
    one.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("1");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    two.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("2");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    three.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("3");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    four.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("4");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    five.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("5");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    six.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("6");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    seven.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("7");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    eight.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("8");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    nine.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("9");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    zero.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("0");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    
    
    }


    public void connecttoserver(String string) throws UnknownHostException, IOException
{
    Socket socket=RequestSocket("192.168.1.100",5000);
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