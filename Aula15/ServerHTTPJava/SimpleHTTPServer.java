import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPServer {

    public static void main(String[] args) {
        int port = 80;
        try {
            // Instancia um novo objeto ServerSocket o qual já abre a porta TCP definida
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server rodando na porta  " + port);
            while (true) { // loop para receber várias conexões
                /*
                 * Aguarda uma requisição (request),
                 * ao receber é criado uma nova thread para tratar a requisição
                 */
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nova conexão recebida");
                handleRequest(clientSocket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handleRequest(Socket clientSocket) throws Exception {
        // Lê a requisição do cliente
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String requestLine = in.readLine();
        System.out.println("Requisição recebida: " + requestLine);
        OutputStream out = clientSocket.getOutputStream();
        PrintWriter writer = new PrintWriter(out, true);

        if (requestLine.startsWith("GET")) {
            writer.println("HTTP/1.1 200 OK");
            writer.println("Content-Type: text/html");
            writer.println("Server: MeuServidor/1.0");
            writer.println();
            writer.println("<html><body><h1>Hello, World!</h1></body></html>");
        } else {
            writer.println("HTTP/1.1 405 Method Not Allowed");
            
        }
        writer.close();
        out.close();
        in.close();
        clientSocket.close();
    }
}
