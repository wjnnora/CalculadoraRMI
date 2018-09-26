/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
/**
 *
 * @author iury
 */
public class SomaParcialMatriz extends Thread{
    
    private final int [][] matrizA,matrizB;
    private final int i,j;
    
    @Override
    public void run(){
        for(int k = 0; k < 3; k++){
            Matriz.resultado [i][j] += matrizA[i][k] * matrizB[k][j];
        }
    }
    
    public SomaParcialMatriz(int[][] matrizA, int[][] matrizB,int i, int j){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.i = i;
        this.j = j;
    }
}
