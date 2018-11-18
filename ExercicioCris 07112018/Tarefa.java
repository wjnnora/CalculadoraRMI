
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tarefa extends Thread {

    private final DatagramSocket socketServidor;
    private final List<String> pacoteDados;
    private final InetAddress pacoteIp; 
    private final int pacotePorta;
    
    public Tarefa(DatagramSocket socketServidor, List<String> pacoteDados, InetAddress pacoteIp, int pacotePorta){
        this.socketServidor = socketServidor;
        this.pacoteDados = pacoteDados;
        this.pacoteIp = pacoteIp;
        this.pacotePorta = pacotePorta;
    }
    
    @Override
    public void run(){

        int soma = 0;
        for(String s: pacoteDados){
            soma += Integer.valueOf(s.trim());
        }
        
        byte[] dados;
        String somaS = String.valueOf(soma);
        dados = somaS.getBytes();
        DatagramPacket resposta = new DatagramPacket(dados, dados.length,
                            pacoteIp, pacotePorta);
        
        try {
            socketServidor.send(resposta);
        } catch (IOException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
