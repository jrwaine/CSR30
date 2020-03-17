import java.io.* ;
import java.net.* ;
import java.util.* ;

public final class WebServer
{
    public static void main(String argv[]) throws Exception
    {
        // Set the port number
        int port = 5000;
        // Establish the listen socket
        ServerSocket serverConnect = new ServerSocket(port);
        System.out.println("Server started.\nListening for connections on port : " + port + " ...\n");

        // Process HTTP service requests in an infinite loop.
        while(true){
            // TODO: Listen for a TCP connection request.
            HttpRequest request = new HttpRequest(serverConnect.accept());

            Thread thread = new Thread(request);
            thread.start();
        }
    }

    
}