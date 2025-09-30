package Lista_4;
public class ListaDuplamenteEncadeada {
    
    public Nodo primeiro;
    public Nodo ultimo;
    public int tamanho;

    public ListaDuplamenteEncadeada(){

        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void inserirInicio(int elemento){

        Nodo novo = new Nodo(elemento);

        if (this.primeiro == null) {
            
            this.primeiro = novo;
            this.ultimo =  novo;
        }else{

            this.primeiro.anterior = novo;
            novo.proximo = this.primeiro;
            this.primeiro = novo;
        }

        tamanho++;
    }

    public void inserirFinal(int elemento){

        Nodo novo = new Nodo(elemento);

        if(this.ultimo == null){

            this.primeiro = novo;
            this.ultimo = novo;
        }else{

            this.ultimo.proximo = novo;
            novo.anterior = this.ultimo;
            this.ultimo = novo;
        }

        tamanho++;
    }

    public void inserirNaPosicao(int elemento, int posicao){
        
        
        Nodo novo = new Nodo(elemento);

        if(this.primeiro == null){
            if(posicao == 1){

                this.ultimo.proximo = novo;
                novo.anterior = this.ultimo;
                this.ultimo = null;

            }else{
                System.out.println("Posição invalida.");
            }
        }else{

            if(posicao <= 0 || posicao > this.tamanho + 1){

                System.out.println("Você tentou acessar uma posição fora dos limites da lista.");
            }else{

                if (posicao == 1) {
                
                    this.primeiro.anterior = novo;
                    novo.proximo = this.primeiro;
                    this.primeiro = novo;
                    
                }else if(posicao == this.tamanho +  1){

                    this.ultimo.proximo = novo;
                    novo.anterior = this.ultimo;
                    this.ultimo = null;
                }else{
                    
                    if(tamanho - posicao < posicao){

                        Nodo aux = this.ultimo;

                        for(int i = 1; i < (tamanho - posicao); i++){

                            aux = aux.proximo;
                        }

                        aux.anterior.proximo = novo;
                        novo.anterior = aux.anterior;
                        novo.proximo = aux;
                        aux.anterior = novo;

                    }else if(tamanho - posicao >= posicao){

                        Nodo aux = this.primeiro;

                        for(int i = 1; i <  posicao -1; i++){

                            aux = aux.proximo;
                        }

                        aux.proximo.anterior = novo;
                        novo.proximo = aux.proximo;
                        aux.proximo = novo;
                        novo.anterior = aux;

                    }

                }
            }

            
        }

        tamanho++;
    }

    public void deletarInicio(){

        if(this.primeiro == null){

            System.out.println("Sua lista está vazia não é possivel excluir");
             
        }else if(tamanho == 1){

            this.primeiro = null;
            this.ultimo = null;

        }else{
            
            this.primeiro =  this.primeiro.proximo;
            this.primeiro.anterior = null;    

        }

        tamanho--;
    }

    public void deletarFinal(){

        if (this.primeiro == null) {
            
            System.out.println("Sua lista está vazia não é possivel excluir");
        }else if(tamanho == 1){

            this.primeiro = null;
            this.ultimo = null;
           
        }else{

            this.ultimo.anterior = this.ultimo;
            this.ultimo.proximo = null;
        }

        tamanho--;
    }

    public void deletarPosicaoEspecifica(int posicao){


        if(primeiro == null){
            System.out.println("Sua lista está vazia não é possivel excluir");

        }else if(tamanho == 1 && posicao == 1){

            this.primeiro = null;
            this.ultimo =null;
            tamanho --;

        }else if( posicao <= 0 || posicao > tamanho){

            System.out.println("Posição invalida!");
        }else if(posicao == tamanho){

            this.ultimo.anterior = this.ultimo;
            this.ultimo.proximo = null;
            tamanho--;
        }else{

            Nodo aux = this.primeiro;
            int cont = 1;

            while(cont < posicao - 1){

                aux = aux.proximo;
                cont++;
            }  

           aux.proximo = aux.proximo.proximo; 
           aux.proximo.anterior = aux;   
           tamanho--; 
            
        }

    }

    public void deletarValorEspecifico(int elemento){

        if(primeiro == null){
            System.out.println("Sua lista está vazia não é possivel excluir");

        }else if(this.primeiro.elemento == elemento){

            this.primeiro = this.primeiro.proximo;
            this.primeiro = null;
            tamanho--;
        }else{

            Nodo aux = this.primeiro;

            while(aux.proximo.elemento != elemento && aux.proximo != null){

                aux = aux.proximo;
            }

            aux.proximo.proximo.anterior = aux;
            aux.proximo = aux.proximo;  
            tamanho--;
        }

    }

    public void exibirLista(){

        Nodo aux = this.primeiro;

        while(aux != null){

            System.out.println("Os valores da lista são: " + aux.elemento);
            aux = aux.proximo;
        }
    }

    public void exibirElementoPosicao(int elemento){

        if(primeiro == null){
            
            System.out.println("Sua lista está vazia, não ha valores a serem exibidos");

        }else if(this.primeiro.elemento == elemento){

            System.out.println("O elemento está na posição: 1");
        }else{

            Nodo aux = this.primeiro.proximo;
            int posicao = 2;

            while (aux != null) {
                
                if(aux.elemento == elemento){

                    System.out.println("O elemento está na posição: " + posicao);
                }
                aux = aux.proximo;
                posicao++;
                
            }

        }
    }

    public void contarElemento(){

        if(primeiro == null){

            System.out.println("Sua lista está vazia!");
        }else if(tamanho == 1){

            System.out.println("Sua lista tem 1 elemento");
        }else{

            Nodo aux = this.primeiro.proximo;
            int cont_valores = 1;

            while(aux != null){

                aux = aux.proximo;
                cont_valores++;
            }

            System.out.println("Sua lista tem " + cont_valores + " elementos");
        }
    }
}
