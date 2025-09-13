/*
3. Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o
outro com números ímpares. O usuário pode digitar os números em qualquer sequência e o programa deverá
armazená-los no vetor correto na ordem em que foram informados pelo usuário.
 */

package Lista1;
import java.util.Scanner;

public class Exe3 {
    
    public static void main(String args []){

        Scanner ler = new Scanner(System.in);


        int vetor_par [] = new int[5];
        int vetor_impar [] = new int[5];
        int tamanho = 0;
       

        for(int i = 0; i < vetor_par.length; i++){

            System.out.print("Insira 5 valores pares: ");
            int num = ler.nextInt();
            OrdenarVetor(vetor_par, tamanho, num);
            tamanho++;

        }

        
        for(int i = 0; i < vetor_impar.length; i++){

            System.out.print("Insira 5 valores pares: ");
            int num = ler.nextInt();
            OrdenarVetor(vetor_impar, tamanho, num);
            tamanho++;
        }

        ler.close();

    }

    public static void OrdenarVetor(int vetor[], int tamanho, int num){

        int j = tamanho - 1;

        while (j >= 0 && vetor[j] > num) {
            
            vetor[j + 1] = vetor[j];
            j--;
        }

        vetor[j + 1] = num;
    }
}
