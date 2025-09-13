public class ListaEncadeada {

    int primeiro;
    int ultimo;
    int[] lista;

    //Crie um método para criar uma lista vazia.
    public ListaEncadeada() {
        this.primeiro = -1;
        this.ultimo = 0;
        this.lista = new int[10];
    }

    //Crie um método responsável por inserir um elemento no início da lista
    public  void InserirInicio(int valor){

        if(primeiro == -1){
            primeiro = 0;
            ultimo =1;
            lista[primeiro] = valor;

        }else{

            if (primeiro != 0){
                
                primeiro--;
                lista[primeiro] = valor;

            }else{

                primeiro = lista.length - 1;
                lista[primeiro] = valor;
            }

        }
    }

    //Crie um método responsável por inserir um elemento no fim da lista
    public void InserirFinal(int valor){
        if(primeiro == -1){

            primeiro = 0;
            ultimo =1;
            lista[primeiro] = valor;

        }else{

            if (ultimo != 0){
                
                lista[ultimo] = valor;
                ultimo++;
                
            }

        }
    }

    //Crie um método responsável por inserir um elemento em uma posição específicada lista
    public void InserirPosicaoEspecifica(int valor, int posicao){


        posicao = primeiro + (posicao - 1);

        for(int j = ultimo; j >= posicao; j--){

            lista[j+1] = lista[j];
        }

        lista[posicao] = valor;
        ultimo ++;
        

    }

    //Crie um método responsável por remover um elemento no início da lista

}
