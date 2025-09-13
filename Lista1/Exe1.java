/*1. Escreva um programa que leia dois vetores inteiros com dez posições cada. A partir desses vetores,
carregue um terceiro vetor onde o valor de cada elemento será a média dos elementos de mesmo índice nos
dois vetores anteriores.*/


package Lista1;
import java.util.Random;

public class Exe1 {
    
    public static void main(String[] args) {

        Random random = new Random();
        
        int vetor1 [] = new int[10];
        int vetor2 [] = new int[10]; 
        int vetor_media [] = new int[10];  

        for(int i = 0; i < vetor1.length; i++){

            vetor1[i] = random.nextInt(100);
            vetor2[i] = random.nextInt(100);
        }

        for(int i = 0; i < vetor_media.length; i++){

            vetor_media[i] = (vetor1[i] + vetor2[i]) / 2;
        }

        System.out.println();

    }
}
