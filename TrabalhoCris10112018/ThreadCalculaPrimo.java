/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iury
 */
public class ThreadCalculaPrimo extends Thread {
    
    private int inicio = 0;
    private int fim = 0;
    private TotalPrimo acumulador;
    
    public ThreadCalculaPrimo(int inicio, int fim, TotalPrimo acumulador){
        this.inicio = inicio;
        this.fim = fim;
        this.acumulador = acumulador;
    }
    
    @Override
    public void run(){
        acumulador.setTotalNumerosPrimos(
                contaPrimos() + acumulador.getTotalNumerosPrimos());
    }
    
    private int contaPrimos(){
        int contPrimos =0;
        for(int i=inicio; i < fim; i++) {
            boolean eNumeroPrimo = true;
            for(int j=2; j < i ; j++) {
                if(i % j == 0) {
                    eNumeroPrimo = false;
                    break;
                }
            }
            if(eNumeroPrimo) contPrimos++;
        }
        
        return contPrimos;
    }
}
