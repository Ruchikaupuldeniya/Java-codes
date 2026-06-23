import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    String type;
    private String topic;

    public ClientHandler(Socket socket, String type, String topic) {
        this.socket = socket;
        this.type = type;
        this.topic = topic;
    }

    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while (true) {
                String message = dis.readUTF();
                System.out.println("Message received from client [" + topic + "]: " + message);

                if (type.equals("PUBLISHER")) {
                    Server.broadcast(message, topic);
                }
            }
        } catch (IOException e) {
            System.out.println("Client disconnected");
        }
    }

    public void sendMessage(String message) {
        try {
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            dout.writeUTF(message);
            dout.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
