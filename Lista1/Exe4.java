/*
4. Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e
execute a pesquisa por um valor passado como parâmetro utilizando o algoritmo da busca binária.
 */

package Lista1;
import java.util.Scanner;

public class Exe4 {

    public static void main(String args[]){

        Scanner ler = new Scanner(System.in);
        int vetor [] = new int [10];
        int i = 0;

        
        while (i < vetor.length) {
            int valor = (int) (Math.random() * vetor.length); 

            if (vetor[valor] == 0) {
                vetor[valor] = i + 1; 
                i++;
            }
        }

        for(int k = 0; k < vetor.length - 1; k++) {
            for(int j = 0; j < vetor.length - 1 - k; j++) {
                
                if(vetor[j] > vetor[j + 1]) {
            
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.print("Insira um valor para realizar uma busca: ");
        int valor_buscar = ler.nextInt();

        BuscaBinaria(vetor, valor_buscar);

        ler.close();
        

}

    public static void BuscaBinaria(int vetor[], int chave){

        int esquerda = 0; 
        int direita = vetor.length - 1;

        while(esquerda <= direita){

            int meio = (esquerda + direita) / 2;

            if(vetor[meio] == chave){

            System.out.println("Valor encontrado");
                return;

            }else if(vetor[meio] < chave){

                esquerda = meio + 1;
            }else{

                direita = meio - 1;
            }

        }

        System.out.println("Valor não encontrado");
    }
    
}
