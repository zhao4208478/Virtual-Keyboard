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
   //����Socket������
} 

public void run() { 
   Socket client;
   String txt;
   try { 
    while (true)
    //�߳�����ѭ����ʵʱ����socket�˿�
    {
     client=ResponseSocket();       
     //��Ӧ�ͻ����������󡣡�
    
     while(true)
     {
      txt=ReceiveMsg(client);  
      System.out.println(txt);
      //���ӻ�ÿͻ��˷�����Ϣ����������ʾ��Server�˵���Ļ��
   
      SendMsg(client,txt);
      //��ͻ��˷�����Ϣ

      if(true)break;
      //�жϣ������ȴ���������
     }
    
     CloseSocket(client);
     //�رմ˴�����
    }   
   } 
   catch (IOException e) {
    System.out.println(e);
   }

}

private ServerSocket server = null;
private static final int PORT = 5000;
private BufferedWriter writer;
private BufferedReader reader;

private void CreateSocket() throws IOException
{
   server = new ServerSocket(PORT, 100);
   System.out.println("Server starting..");  
}

private Socket ResponseSocket() throws IOException
{
   Socket client = server.accept(); 
   System.out.println("client connected..");
  
   return client;
}

private void CloseSocket(Socket socket) throws IOException
{
   reader.close();
   writer.close();
   socket.close();
   System.out.println("client closed..");
}

private void SendMsg(Socket socket,String Msg) throws IOException 
{
   writer = new BufferedWriter(
      new OutputStreamWriter(socket.getOutputStream()));
    writer.write(Msg+"\n");
    writer.flush();
   
}

private String ReceiveMsg(Socket socket) throws IOException
{
   reader = new BufferedReader(
     new InputStreamReader(socket.getInputStream()));     
    System.out.println("server get input from client socket..");
    String txt="Sever send:"+reader.readLine();
   
    return txt;
}

public static void main(final String args[]) throws IOException {
   Server yaochatserver = new Server();
   if (yaochatserver != null) {
    yaochatserver.start();
   }
}

}