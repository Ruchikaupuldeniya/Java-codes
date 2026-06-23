import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.DataInputStream;

public class Client {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java Client <Server IP> <Port> <Type: PUBLISHER or SUBSCRIBER> <Topic>");
            System.exit(1);
        }

        String serverIP = args[0];
        int port = Integer.parseInt(args[1]);
        String type = args[2];
        String topic = args[3];

        try {
            Socket socket = new Socket(serverIP, port);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(type); // Send client type to the server
            dos.writeUTF(topic); // Send client topic to the server

            if (type.equals("PUBLISHER")) {
                // Publisher logic: read user input and send to server
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    System.out.print("Enter the message to publish: ");
                    String msg = userInput.readLine();
                    dos.writeUTF(msg);
                    dos.flush();
                }
            } else {
                // Subscriber logic: continuously receive and print messages from the server
                (new Thread(() -> {
                    try {
                        while (true) {
                            String msg = (new DataInputStream(socket.getInputStream())).readUTF();
                            System.out.println("Message from publisher [" + topic + "]: " + msg);
                        }
                    } catch (Exception e) {
                        System.out.println("Server disconnected");
                    }
                })).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
