import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
     static ServerSocket sSocket;
     public static void main ( String[] args ) {
    	 try {
    		 sSocket = new ServerSocket( 8787 ) ;
    		 System.out.println( "监控8787接口" ) ;
    		 while( true ) {
    			 Socket socket = sSocket.accept() ;
    			 DataInputStream diStream = new DataInputStream( socket.getInputStream() ) ;
    			 DataOutputStream dotStream = new DataOutputStream( socket.getOutputStream() ) ;
    			 System.out.println( "客户端信息: " + diStream.readUTF() ) ;
    			 dotStream.writeUTF( "success" ) ;
    			 diStream.close() ;
    			 dotStream.close() ;
    			 socket.close() ;
    		 }
    	 } catch ( Exception e ) {
    		 e.printStackTrace();
    	 }
     }
}