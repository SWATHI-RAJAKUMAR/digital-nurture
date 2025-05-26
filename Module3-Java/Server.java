import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String msgFromClient, msgToClient;

        while ((msgFromClient = in.readLine()) != null) {
            System.out.println("Client: " + msgFromClient);
            msgToClient = console.readLine();
            out.println(msgToClient);
            if ("bye".equalsIgnoreCase(msgToClient)) break;
        }

        clientSocket.close();
        serverSocket.close();
    }
}