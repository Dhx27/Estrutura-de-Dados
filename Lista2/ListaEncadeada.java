public class ListaEncadeada {

    int primeiro;
    int ultimo;
    int[] lista;

    // Cria uma lista vazia
    public ListaEncadeada() {
        this.primeiro = -1;
        this.ultimo = 0;
        this.lista = new int[10];
    }

    // Insere no início
    public void InserirInicio(int valor) {
        if (primeiro == -1) {
            primeiro = 0;
            ultimo = 1;
            lista[primeiro] = valor;
        } else {
            if (primeiro != 0) {
                primeiro--;
                lista[primeiro] = valor;
            } else {
                primeiro = lista.length - 1;
                lista[primeiro] = valor;
            }
        }
    }

    // Insere no fim
    public void InserirFinal(int valor) {
        if (primeiro == -1) {
            primeiro = 0;
            ultimo = 1;
            lista[primeiro] = valor;
        } else {
            lista[ultimo] = valor;
            ultimo++;
        }
    }

    // Insere em uma posição específica
    public void InserirPosicaoEspecifica(int valor, int posicao) {
        posicao = primeiro + (posicao - 1);
        for (int j = ultimo; j >= posicao; j--) {
            lista[j + 1] = lista[j];
        }
        lista[posicao] = valor;
        ultimo++;
    }

    // Remove no início
    public void RemoverInicio() {
        if (primeiro == -1) {
            System.out.println("Lista vazia!");
            return;
        }
        for (int i = primeiro; i < ultimo - 1; i++) {
            lista[i] = lista[i + 1];
        }
        ultimo--;
        if (ultimo == 0) {
            primeiro = -1; // lista ficou vazia
        }
    }

    // Remove no fim
    public void RemoverFinal() {
        if (primeiro == -1) {
            System.out.println("Lista vazia!");
            return;
        }
        ultimo--;
        if (ultimo == 0) {
            primeiro = -1; // lista ficou vazia
        }
    }

    // Remove em uma posição específica
    public void RemoverPosicaoEspecifica(int posicao) {
        if (primeiro == -1 || posicao <= 0 || posicao > (ultimo - primeiro)) {
            System.out.println("Posição inválida!");
            return;
        }
        int index = primeiro + (posicao - 1);
        for (int i = index; i < ultimo - 1; i++) {
            lista[i] = lista[i + 1];
        }
        ultimo--;
        if (ultimo == 0) {
            primeiro = -1;
        }
    }

    // Remove um elemento específico (primeira ocorrência)
    public void RemoverElemento(int valor) {
        int index = -1;
        for (int i = primeiro; i < ultimo; i++) {
            if (lista[i] == valor) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Elemento não encontrado!");
            return;
        }
        for (int i = index; i < ultimo - 1; i++) {
            lista[i] = lista[i + 1];
        }
        ultimo--;
        if (ultimo == 0) {
            primeiro = -1;
        }
    }

    // Exibe o conteúdo da lista
    public void ExibirLista() {
        if (primeiro == -1) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.print("Lista: ");
        for (int i = primeiro; i < ultimo; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    // Pesquisa elemento específico e retorna posição
    public void PesquisarElemento(int valor) {
        if (primeiro == -1) {
            System.out.println("Lista vazia!");
            return;
        }
        for (int i = primeiro; i < ultimo; i++) {
            if (lista[i] == valor) {
                System.out.println("Elemento " + valor + " encontrado na posição " + (i - primeiro + 1));
                return;
            }
        }
        System.out.println("Elemento não encontrado!");
    }

    // Retorna número de elementos
    public int NumeroElementos() {
        if (primeiro == -1) {
            return 0;
        }
        return ultimo - primeiro;
    }
}
