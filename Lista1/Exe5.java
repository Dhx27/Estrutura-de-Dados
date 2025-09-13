/*
5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem crescente e compare o
número de trocas que eles efetuam durante a ordenação de:
a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.
 */

package Lista1;


public class Exe5 {
    public static void main(String[] args) {
        int n = 100;
        int[] vetorAleatorio = new int[n];
        int[] vetorDecrescente = new int[n];
      

    
        int k = 0;
        while (k < vetorAleatorio.length) {
            int valor = (int) (Math.random() * vetorAleatorio.length);
            if (vetorAleatorio[valor] == 0) {
                vetorAleatorio[valor] = k + 1;
                k++;
            }
        }

        // Preencher vetor decrescente 100 a 1
        for (int i = 0; i < n; i++) {
            vetorDecrescente[i] = n - i;
        }

        

        int[] copiaVetor = new int[n];
        for (int i = 0; i < n; i++) copiaVetor[i] = vetorAleatorio[i];
        System.out.println("Bubble Sort - vetor aleatório: " + bubbleSort(copiaVetor) + " trocas");

        // vetor decrescente
        for (int i = 0; i < n; i++) copiaVetor[i] = vetorDecrescente[i];
        System.out.println("Bubble Sort - vetor decrescente: " + bubbleSort(copiaVetor) + " trocas");


        // vetor aleatório
        for (int i = 0; i < n; i++) copiaVetor[i] = vetorAleatorio[i];
        System.out.println("Quick Sort - vetor aleatório: " + quickSort(copiaVetor) + " trocas");

        // vetor decrescente
        for (int i = 0; i < n; i++) copiaVetor[i] = vetorDecrescente[i];
        System.out.println("Quick Sort - vetor decrescente: " + quickSort(copiaVetor) + " trocas");
    }

    
    public static int bubbleSort(int[] vetor) {
        int trocas = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                }
            }
        }
        return trocas;
    }

    
    public static int quickSort(int[] vetor) {
        int[] contador = new int[1]; 
        quickSortRec(vetor, 0, vetor.length - 1, contador);
        return contador[0];
    }

    public static void quickSortRec(int[] vetor, int esquerda, int direita, int[] contador) {
        if (esquerda < direita) {
            int pivoIndex = partition(vetor, esquerda, direita, contador);
            quickSortRec(vetor, esquerda, pivoIndex - 1, contador);
            quickSortRec(vetor, pivoIndex + 1, direita, contador);
        }
    }

    public static int partition(int[] vetor, int esquerda, int direita, int[] contador) {
        int pivo = vetor[direita];
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                contador[0]++;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[direita];
        vetor[direita] = temp;
        contador[0]++;

        return i + 1;
    }
}
