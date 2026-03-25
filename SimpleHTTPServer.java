import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Java program to create a simple HTTP Server to demonstrate how to use
 * ServerSocket and Socket class.
 */
public class SimpleHTTPServer {

    public static void main(String args[]) throws IOException {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            try (Socket socket = server.accept()) {
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + 
                "<p>This is a simple HTTP Server in Java.</p>";
                socket.getOutputStream()
                      .write(httpResponse.getBytes("UTF-8"));
            }
        }
    }

}
