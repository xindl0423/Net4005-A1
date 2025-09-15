import java.net.*;
import java.io.*;
import java.uti.concurrent.*;

public class myfileserver extend Thread{
    private ServerSocket serverSocket;
    int  totalrequests = 0;
    int successfulrequests = 0;
    int MAX_THREADS = 10;
    private ServerSocket serverSocket;

    public myfileserver(int port) throws IOException {
   serverSocket = new ServerSocket(port);
   serverSocket.setSoTimeout(10000);
} 
    private void acceptconnections(){
        while (true){
            Socket clientsocket = serverSocket.accept();
            if(clientsocket.isconnected())
            new Thread.( () ->{
                clientconnection client = new clientconnection(clientsocket);
            } ).start();
        }
    }
 public static void main(String[] args){
    System.out.println();
 }

}