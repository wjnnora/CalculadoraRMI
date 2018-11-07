
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClienteUDP {

    public ClienteUDP() {
// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws IOException {
        DatagramSocket socketComUDP
                = new DatagramSocket();
        System.out.println("Criando um "
                + "socket na porta:"
                + socketComUDP.getLocalPort());
//criando a mensagem para o servidor
        String dados = "10e20e40"; // para interromper o servidor é só informar um número negativo, ex: String dados = "-10";
        byte[] buffer;
        buffer = dados.getBytes();
//convertendo o endereco ip do servidor em um objeto Inet
        InetAddress enderecoIP
                = InetAddress.getByName("127.0.0.1");
        int porta = 6789;
        DatagramPacket requisicao
                = new DatagramPacket(buffer,
                        buffer.length,
                        enderecoIP, porta);
        socketComUDP.send(requisicao);
        System.out.println("Envio de "
                + "requisição ao servidor. Conteúdo: " + dados);
        socketComUDP.setSoTimeout(10000);
//obtendo a resposta do servidor
        buffer = new byte[1000];
        DatagramPacket resposta = new DatagramPacket(
                buffer,
                buffer.length);
        socketComUDP.receive(resposta);
        System.out.println("Recebido: "
                + (new String(resposta.getData())).trim());
        socketComUDP.close();
    }
}
