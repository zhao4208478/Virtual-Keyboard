import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
      ReceiveMsg(client);  
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

private void ReceiveMsg(Socket socket) throws IOException
{
   reader = new BufferedReader(
     new InputStreamReader(socket.getInputStream()));     
  //  System.out.println("server get input from client socket..");
    String txt= reader.readLine();
    if ( txt.length() > 2 ) {
    	System.out.print("\n");
	}
    else System.out.print(txt);
}

public static void main(final String args[]) throws IOException {
   Server yaochatserver = new Server();
   if (yaochatserver != null) {
    yaochatserver.start();
   }
}

}