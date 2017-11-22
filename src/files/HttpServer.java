package files;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    Socket socket;

    public HttpServer() throws IOException {
        try (ServerSocket ssocket = new ServerSocket(12345)) {
            byte[] buf = new byte[10024];
            Socket socket = ssocket.accept();
            BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            while (( in.read(buf)) > 0) {
                result.write(buf);
                System.out.println(result.toString());
                writer.write("HTTP/1.0 200 OK");
                writer.write("<html><body>Hello</body></html>");
                writer.flush();
            }
            //System.out.println(result.toString());
        }
    }

    public static void main(String[] args) {
     // HttpServer server = new HttpServer();
        try {
            new HttpServer();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
