import java.io.* ;
import java.net.* ;
import java.util.* ;


final class HttpRequest implements Runnable
{
    final static String CRLF = "\r\n";
    Socket socket;

    // Constructor
    public HttpRequest(Socket socket) throws Exception
    {
        this.socket = socket;
    }

    // Implement the run() method of the Runnable interface.
    public void run() {
        try {
            processRequest();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void processRequest() throws Exception
    {
        // TODO:Get a reference to the socket's input and output streams.
        InputStreamReader is = new InputStreamReader(socket.getInputStream());
        OutputStream os = socket.getOutputStream();

        // TODO: Set up input stream filters.
        // ?
        BufferedReader br = new BufferedReader(is);

        // Get the request line of the HTTP request message.
        String requestLine = br.readLine();

        // Display the request line.
        System.out.println();
        System.out.println(requestLine);

        // Get and display the header lines.
        String headerLine = null;
        while ((headerLine = br.readLine()).length() != 0) {
            System.out.println(headerLine);
        }

        os.close();
        br.close();
        socket.close();
    }
}