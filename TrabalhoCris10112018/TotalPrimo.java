/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iury
 */
public class TotalPrimo {
    private int totalNumerosPrimos;
    
    public TotalPrimo(){
        totalNumerosPrimos = 0;
    }

    public synchronized int getTotalNumerosPrimos() {
        return totalNumerosPrimos;
    }

    public synchronized void setTotalNumerosPrimos(int totalNumerosPrimos) {
        this.totalNumerosPrimos = totalNumerosPrimos;
    }
    
    
}
