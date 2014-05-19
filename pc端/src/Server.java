import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Server extends Thread {
private Server() throws IOException {
   CreateSocket();
   //创建Socket服务器
} 

public void run() { 
   Socket client;
   String txt;
   try { 
    while (true)
    //线程无限循环，实时监听socket端口
    {
     client=ResponseSocket();       
     //响应客户端链接请求。。
    
     while(true)
     {
      ReceiveMsg(client );  
      //链接获得客户端发来消息，并将其显示在Server端的屏幕上

      if(true)break;
      //中断，继续等待链接请求
     }
    
     CloseSocket(client);
     //关闭此次链接
    }   
   } 
   catch (IOException e) {
    System.out.println(e);
   }
}

public int[] number = new int[] {KeyEvent.VK_0,
		KeyEvent.VK_1,KeyEvent.VK_2,KeyEvent.VK_3,
		KeyEvent.VK_4,KeyEvent.VK_5,KeyEvent.VK_6,
		KeyEvent.VK_7,KeyEvent.VK_8,KeyEvent.VK_9};

public boolean[] n = new boolean[] {
		true,true,true,true,true,
		true,true,true,true,true};

public int[] Letter = new int[] {
		KeyEvent.VK_A,KeyEvent.VK_B,KeyEvent.VK_C,
		KeyEvent.VK_D,KeyEvent.VK_E,KeyEvent.VK_F,
		KeyEvent.VK_G,KeyEvent.VK_H,KeyEvent.VK_I,
		KeyEvent.VK_J,KeyEvent.VK_K,KeyEvent.VK_L,
		KeyEvent.VK_M,KeyEvent.VK_N,KeyEvent.VK_O,
		KeyEvent.VK_P,KeyEvent.VK_Q,KeyEvent.VK_R,
		KeyEvent.VK_S,KeyEvent.VK_T,KeyEvent.VK_U,
		KeyEvent.VK_V,KeyEvent.VK_W,KeyEvent.VK_X,
		KeyEvent.VK_Y,KeyEvent.VK_Z};

public boolean[] l = new boolean[] {
		true,true,true,true,true,
		true,true,true,true,true,
		true,true,true,true,true,
		true,true,true,true,true,
		true,true,true,true,true,
		true};

public boolean shift = true;
public boolean enter = true;
public boolean kaca = true;
public boolean back = true;
public boolean minus = true;
public boolean open = true;
public boolean close = true;

public int xs;
public int ys;

private ServerSocket server = null;
private static final int PORT = 5000;
private BufferedReader reader;

private void CreateSocket() throws IOException
{
   server = new ServerSocket(PORT, 100);
   System.out.println("Server starting..");  
}

private Socket ResponseSocket() throws IOException
{
   Socket client = server.accept(); 
  // System.out.println("client connected..");
  
   return client;
}

private void CloseSocket(Socket socket) throws IOException
{
   reader.close();
   socket.close();
   //System.out.println("client closed..");
}

private void ReceiveMsg(Socket socket ) throws IOException
{
    reader = new BufferedReader( new InputStreamReader(socket.getInputStream()));     
  //  System.out.println("server get input from client socket..");
    String txt= reader.readLine();
    char a[] = txt.toCharArray() ;
    System.out.println(txt.toCharArray());
    if ( txt.length() > 2 ) {
    //	System.out.print("\n");
    	
    if (( a[1] <= '9' ) && ( a[1] >= '0' )){   //x,y
    	int i = 1 , x = 0 , y = 0;
    	while ( a[i] != ',' ) {
			x = x * 10 + (a[i] - 48);
			i++;
		}
    	i++;
    	while ( i < txt.length() ) {
			y = y * 10 + (a[i] - 48);
			i++;
		}
        System.out.println(x);
        System.out.println(y);
    	Point mousepoint = MouseInfo.getPointerInfo().getLocation();  
    	if (a[0]=='a'){
    		xs = x;
    		ys = y;
    	}
    	else if (a[0]=='z'){
    		try {
        		Robot robot = new Robot();
        		robot.mouseMove( mousepoint.x + ( x - xs ) * 2 , mousepoint.y  + ( y - ys ) * 2 );		
    			} catch (AWTException e) {
        		e.printStackTrace();
        		}
		}
    	else {
    		try {
        		Robot robot = new Robot();
        		robot.mouseMove( mousepoint.x + ( x - xs ) * 2 , mousepoint.y  + ( y - ys ) * 2 );		
    			} catch (AWTException e) {
        		e.printStackTrace();
        		}
    		xs = x;
    		ys = y;
		}
    } else  
    if ( a[0] == 'c'){
        try {
        	Robot robot = new Robot();
        	robot.mousePress(InputEvent.BUTTON1_MASK);
        	robot.mouseRelease(InputEvent.BUTTON1_MASK);
    		} catch (AWTException e) {
        	e.printStackTrace();
        	} 
    } else    	
    if ( a[0] == 'e'){
    	try {
    		Robot robot = new Robot();
			if ( enter == true )
			{
    		robot.keyPress(KeyEvent.VK_ENTER);
    		enter = false ;			
			}
    		else
			{
    		robot.keyRelease(KeyEvent.VK_ENTER);
    		enter = true ;
			}
			} catch (AWTException e) {
    		e.printStackTrace();
    		} 
    } else
    if ( a[0] == 'b'){
    	try {
    		Robot robot = new Robot();
    		if ( back == true )
			{
    	  	robot.keyPress(KeyEvent.VK_BACK_SPACE);
    		back = false ;			
			}
    		else
			{
        	robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    		back = true ;
			}
    		} catch (AWTException e) {
    		e.printStackTrace();
    		} 
    } else
    if ( a[0] == 's'){
    	    try {
    		Robot robot = new Robot();
    		if ( shift == true )
			{
        	robot.keyPress(KeyEvent.VK_SHIFT);
    		shift = false ;			
			}
    		else
			{
        	robot.keyRelease(KeyEvent.VK_SHIFT);
    		shift = true ;
			}
    	//	System.out.print(eyEvent.VK_SHIFT);
    		} catch (AWTException e) {
    		e.printStackTrace();
    		}	
    }
    }
    else 
    { 	
   // 	System.out.print(a[0]);
    	if (( a[0] <= '9' ) && ( a[0] >= '0' )){
    		try {
        		Robot robot = new Robot();
        		if ( n[((int) a[0] - '0' )] == true )
    			{
            	robot.keyPress(number[((int) a[0] - '0' )]);
            	n[((int) a[0] - '0' )] = false ;			
    			}
        		else
    			{
            	robot.keyRelease(number[((int) a[0] - '0' )]);
            	n[((int) a[0] - '0' )] = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
        } else
    	if (( a[0] <= 'Z' ) && ( a[0] >= 'A' )){   
    		try {
        		Robot robot = new Robot();
        		if ( l[((int) a[0] - 'A' )] == true )
    			{
            	robot.keyPress(Letter[((int) a[0] - 'A' )]);
            	l[((int) a[0] - 'A' )] = false ;			
    			}
        		else
    			{
            	robot.keyRelease(Letter[((int) a[0] - 'A' )]);
            	l[((int) a[0] - 'A' )] = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
        } else
    	if ( a[0] == ' ' ){	
    		try {
        		Robot robot = new Robot();
        		if ( kaca == true )
    			{
            	robot.keyPress(KeyEvent.VK_SPACE);
            	kaca = false ;			
    			}
        		else
    			{
            	robot.keyRelease(KeyEvent.VK_SPACE);
            	kaca = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
    	} else
    	if ( a[0] == '-' ){	
    		try {
        		Robot robot = new Robot();
        		if ( minus == true )
    			{
            	robot.keyPress(KeyEvent.VK_MINUS);
            	minus = false ;			
    			}
        		else
    			{
                robot.keyPress(KeyEvent.VK_MINUS);
                minus = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
    	} else
    	if ( a[0] == '[' ){	
    		try {
        		Robot robot = new Robot();
        		if ( open == true )
    			{
            	robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
            	open = false ;			
    			}
        		else
    			{
                robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                open = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
    	} else
    	if ( a[0] == ']' ){	
    		try {
        		Robot robot = new Robot();
        		if ( close == true )
    			{
            	robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            	close = false ;			
    			}
        		else
    			{
                robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                close = true ;
    			}
        		} catch (AWTException e) {
        		e.printStackTrace();
        		}
    	};
    }
}

public static void main(final String args[]) throws IOException {
   Server yaochatserver = new Server();
   if (yaochatserver != null) {
    yaochatserver.start();
   }
}

}