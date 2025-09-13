/*
2. Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e
100. Percorrendo o vetor criado apenas uma vez, imprima a posição onde ocorre o menor o valor, a soma dos
números armazenados e preencha os valores de um novo vetor com metade do tamanho do vetor original
onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor original. A
segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em
diante.
*/
package Lista1;

import java.util.Random;

public class Exe2 {
    
    public static void main(String args[]){

        Random random = new Random();

        int vetor [] = new int[100];
        int vetor2[]=  new int[50];

        for(int i = 0; i < vetor.length; i++){
            
            vetor[i] = random.nextInt(100);
            
        }

        int soma = 0;
        int menor = vetor[0];
        int tamanho =  vetor.length;

        for(int i = 0; i < vetor.length; i++){

            if(i < 50){

                vetor2[i] = vetor[i] / vetor[tamanho - 1];
            }

            if(vetor[i] <= menor){

                menor = vetor[i];
            }

            soma += vetor[i];
        }

        System.err.println(soma);
        System.out.println(menor);
        




    }
}
