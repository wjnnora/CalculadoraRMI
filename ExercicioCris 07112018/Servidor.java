
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iury
 */
public class Servidor {

    public static void main(String[] args) {
        DatagramSocket socketServidor = null;
        List<Thread> tarefas = new ArrayList<>();

        try {
            socketServidor = new DatagramSocket(6789);

            byte[] dados = new byte[1000];
            DatagramPacket pacote = new DatagramPacket(dados, dados.length);

            try {
                boolean execucao = true;
                while (execucao) {
                    socketServidor.receive(pacote);

                    List<String> pacoteDados = new ArrayList<>();
                    for (String s : (new String(pacote.getData())).split("e")) {
                        if(Integer.valueOf(s.trim()) < 0) execucao = false;
                        pacoteDados.add(s);
                    }
                    Tarefa tarefa = new Tarefa(socketServidor, pacoteDados,pacote.getAddress(),pacote.getPort());

                    tarefas.add(tarefa);
                    tarefa.start();
                }

            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SocketException ex) {
            System.out.println("Porta já ocupada, não foi possível estabelecer o socket");
        } finally {
            if (socketServidor != null) {

                for (Thread t : tarefas) {
                    if (t != null) {
                        try {
                            t.join();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                socketServidor.close();
            }

        }
    }
}
