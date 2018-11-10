
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iury
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int numeroThreads = 10;

        System.out.println("Digite o número inicial:");
        int inicio = leitor.nextInt();

        System.out.println("Digite o número final:");
        int fim = leitor.nextInt();

        int intervalo = (fim - inicio + 1) / numeroThreads;
        List<ThreadCalculaPrimo> listaThread = new ArrayList<>();
        TotalPrimo acumulador = new TotalPrimo();

        for (int i = 0; i < numeroThreads; i++) {
            
            int begin = inicio + (i * intervalo);
            int end = inicio + ((i + 1) * intervalo);
            
            if(i+1 == numeroThreads) {
                if(end<=fim) 
                    end = fim + 1;
            }
            
            listaThread.add(new ThreadCalculaPrimo(begin, end,acumulador));
            listaThread.get(i).start();
        }
        
        boolean controle = true;
        while (controle) {
            for(Thread t:listaThread){
                controle = false;
                if(t.isAlive()){
                    controle = true;
                    break;
                }
                    
            }
        }
        
        System.out.println("O total de números primos é: " + acumulador.getTotalNumerosPrimos());
    }
}
