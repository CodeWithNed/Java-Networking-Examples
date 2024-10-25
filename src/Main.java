import com.networking.tcp.TCPServer;

public class Main {
    public static void main(String[] args) {

        try {
            TCPServer tcpServer = new TCPServer();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Hello world!");
    }
}