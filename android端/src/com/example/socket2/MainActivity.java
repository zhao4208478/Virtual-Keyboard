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
    private Button back;
    private Button shift1;
    private Button shift2;
    
    
    
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
    
  /*  A.setOnClickListener(new View.OnClickListener() {  
    public void onClick(View v) {
     try {
      connecttoserver("A");
     } catch (UnknownHostException e) {
      e.printStackTrace();
     } catch (IOException e) {
      e.printStackTrace();
     }
    }
    });*/
        A.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("A");
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	    }
        	    case MotionEvent.ACTION_UP: 
        	    {
        	         try {
        	          connecttoserver("A");
        	         } catch (UnknownHostException e) {
        	          e.printStackTrace();
        	         } catch (IOException e) {
        	          e.printStackTrace();
        	         }
        	         break;
        	    }
        		}
        	return true; 
        	}
        	  
    	         
        	
        	
        	
        	
        	});
   /* B.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("B");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        B.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("B");
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
        	          connecttoserver("B");
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
   /* C.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("C");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        C.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("C");
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
        	          connecttoserver("C");
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
    
   /* D.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("D");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        D.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("D");
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
        	          connecttoserver("D");
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
    
    /*E.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("E");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        E.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("E");
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
        	          connecttoserver("E");
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
    
    /*F.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("F");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        F.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("F");
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
        	          connecttoserver("F");
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
    
   /* G.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("G");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        G.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("G");
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
        	          connecttoserver("G");
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
    
    /*H.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("H");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        H.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("H");
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
        	          connecttoserver("H");
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
    
    /*I.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("I");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        I.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("I");
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
        	          connecttoserver("I");
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
    
    /*J.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("J");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        J.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("J");
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
        	          connecttoserver("J");
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
    
   /* K.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("K");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        K.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("K");
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
        	          connecttoserver("K");
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
    
   /* L.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("L");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        L.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("L");
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
        	          connecttoserver("L");
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
    
    /*M.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("M");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        M.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("M");
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
        	          connecttoserver("M");
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
    
   /* N.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("N");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        N.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("N");
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
        	          connecttoserver("N");
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
    
    /*O.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("O");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        O.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("O");
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
        	          connecttoserver("O");
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
    
    /*P.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("P");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        P.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("P");
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
        	          connecttoserver("P");
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
    
    /*Q.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Q");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        Q.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("Q");
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
        	          connecttoserver("Q");
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
    
    /*r.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("R");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        r.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("R");
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
        	          connecttoserver("R");
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
    
    /*S.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("S");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        S.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("S");
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
        	          connecttoserver("S");
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
    
    /*T.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("T");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        T.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("T");
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
        	          connecttoserver("T");
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
    
    /*U.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("U");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        U.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("U");
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
        	          connecttoserver("U");
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
    
    /*V.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("V");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        V.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("V");
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
        	          connecttoserver("V");
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
    
   /* W.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("W");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        W.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("W");
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
        	          connecttoserver("W");
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
    
    /*X.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("X");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        X.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("X");
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
        	          connecttoserver("X");
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
    
    /*Y.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Y");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        Y.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("Y");
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
        	          connecttoserver("Y");
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
    
   /* Z.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("Z");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
        Z.setOnTouchListener(new View.OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) 
        	{ switch (event.getAction()) 
        		{ 
        	    case MotionEvent.ACTION_DOWN: 
        	    {
        	         try {
        	          connecttoserver("Z");
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
        	          connecttoserver("Z");
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
    
   /* kaca.setOnClickListener(new View.OnClickListener() {  
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
    */
    kaca.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver(" ");
    	         } catch (UnknownHostException e) {
    	          e.printStackTrace();
    	         } catch (IOException e) {
    	          e.printStackTrace();
    	         }
    	         break;
    	    }
    	    case MotionEvent.ACTION_UP: //Ì§Æð break; 
    	    {
    	         try {
    	          connecttoserver(" ");
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
    
    /*enter.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("enter");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
    enter.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("enter");
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
    	          connecttoserver("enter");
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
    
  /*  one.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("1");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
    one.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("1");
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
    	          connecttoserver("1");
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
    
   /* two.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("2");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });  */
    two.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("2");
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
    	          connecttoserver("2");
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
    
   /* three.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("3");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });   */
    three.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("3");
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
    	          connecttoserver("3");
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
    
    /*four.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("4");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    */
    four.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("4");
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
    	          connecttoserver("4");
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
    
    /*five.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("5");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
    five.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("5");
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
    	          connecttoserver("5");
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
    
    /*six.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("6");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });  */
    six.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("6");
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
    	          connecttoserver("6");
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
    
    /*seven.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("7");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    */
    seven.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("7");
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
    	          connecttoserver("7");
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
    
    /*eight.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("8");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        }); */
    eight.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("8");
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
    	          connecttoserver("8");
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
    
   /* nine.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("9");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });  */
    nine.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("9");
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
    	          connecttoserver("9");
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
    
    /*zero.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("0");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
    zero.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("0");
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
    	          connecttoserver("0");
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
    
    /*back.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("back");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        }); */
    back.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("back");
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
    	          connecttoserver("back");
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
    
    /*shift1.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("shift");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });    */
    shift1.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("shift");
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
    	          connecttoserver("shift");
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
   /* shift2.setOnClickListener(new View.OnClickListener() {  
        public void onClick(View v) {
         try {
          connecttoserver("shift");
         } catch (UnknownHostException e) {
          e.printStackTrace();
         } catch (IOException e) {
          e.printStackTrace();
         }
        }
        });*/
    shift2.setOnTouchListener(new View.OnTouchListener() {
    	public boolean onTouch(View v, MotionEvent event) 
    	{ switch (event.getAction()) 
    		{ 
    	    case MotionEvent.ACTION_DOWN: 
    	    {
    	         try {
    	          connecttoserver("shift");
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
    	          connecttoserver("shift");
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