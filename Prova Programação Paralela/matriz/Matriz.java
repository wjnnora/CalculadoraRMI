
package matriz;
import java.util.concurrent.ThreadLocalRandom;

public class Matriz {

    static int[][] resultado = new int[3][3];
    
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        System.out.println("Matriz A(sem preencher):");
        printarMatriz(matrizA);
        
        System.out.println("");System.out.println("");
        
        System.out.println("Matriz B(sem preencher):");
        printarMatriz(matrizB);
        
        matrizA = preencherMatriz(matrizA);
        matrizB = preencherMatriz(matrizB);
        
        System.out.println("Matriz A(preenchida):");
        printarMatriz(matrizA);
        
        System.out.println("");System.out.println("");
        
        System.out.println("Matriz B(preenchida):");
        printarMatriz(matrizB);
        
        int[][] matrizResultante = multiplicarMatrizes(matrizA,matrizB);
        
        System.out.println("");System.out.println("");
        
        System.out.println("Matriz Resultante(sem Thread):");
        printarMatriz(matrizResultante);
    
        System.out.println("");System.out.println("");
        System.out.println("Matriz Resultante(com Threads):");
        
        Thread [] threads = new Thread[9];
        int contadorThread = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                threads[contadorThread] = new SomaParcialMatriz(matrizA, matrizB, i, j);
                threads[contadorThread].start();
                contadorThread++;
            }
        }
        
        boolean terminaram;        
        do{
            terminaram = true;
            for(int i=0; i<threads.length; i++){
                if(threads[i].isAlive())
                    terminaram = false;
            }
        }while(!terminaram);
        
        printarMatriz(resultado);
    }

    static int[][] preencherMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                matriz[i][j] = (i+1) + randomNum;
            }
        }
        
        return matriz;
    }
    
    static void printarMatriz(int [][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz["+i+ "]["+j+"] = " + matriz[i][j]); 
            }
        }
    }

    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        
        int[][] _resultado = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++){
                 _resultado [i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        
        return _resultado;
    }
}
