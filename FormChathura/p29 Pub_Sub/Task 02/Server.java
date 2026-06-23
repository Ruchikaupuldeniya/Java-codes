import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.io.DataInputStream;

public class Server {
    private static ServerSocket serverSocket;
    private static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Server is running...");

            while (true) {
                Socket socket = serverSocket.accept();
                String clientType = (new DataInputStream(socket.getInputStream())).readUTF(); // Read client type

                ClientHandler clientHandler = new ClientHandler(socket, clientType);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void broadcast(String message) {
        for (ClientHandler client : clients) {
            if (client.type.equals("SUBSCRIBER")) {
                client.sendMessage(message);
            }
        }
    }
}
