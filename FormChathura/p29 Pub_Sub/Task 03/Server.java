import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.DataInputStream;

public class Server {
    private static ServerSocket serverSocket;
    private static Map<String, List<ClientHandler>> topics = new HashMap<>();

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Server is running...");

            while (true) {
                Socket socket = serverSocket.accept();
                String clientType = (new DataInputStream(socket.getInputStream())).readUTF(); // Read client type
                String topic = (new DataInputStream(socket.getInputStream())).readUTF(); // Read client topic

                ClientHandler clientHandler = new ClientHandler(socket, clientType, topic);

                // Create topic list if not exists
                topics.putIfAbsent(topic, new ArrayList<>());

                topics.get(topic).add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void broadcast(String message, String topic) {
        for (ClientHandler client : topics.getOrDefault(topic, new ArrayList<>())) {
            if (client.type.equals("SUBSCRIBER")) {
                client.sendMessage(message);
            }
        }
    }
}
