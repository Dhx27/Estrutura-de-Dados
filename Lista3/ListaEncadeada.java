package Lista3;

public class ListaEncadeada {
    
    public Nodo primeiro;
    public Nodo ultimo;
    public int tamanho;

    public ListaEncadeada(){

        this.primeiro = null;
        this.ultimo = null;
        tamanho = 0;
    }

    public void inserirInicio(int elemento){

        Nodo novo = new Nodo(elemento);

        if(this.primeiro == null){

            this.primeiro = novo;
            this.ultimo = novo;

        }else{

            novo.proximo = this.primeiro;
            this.primeiro = novo;
        }

        tamanho++;

    }

    public void inserirFinal(int elemento){

        Nodo novo =  new Nodo(elemento);

        if(this.primeiro == null){

            this.primeiro = novo;
            this.ultimo = novo;
        }else{

           this.ultimo.proximo = novo;   
            this.ultimo = novo;

        }

        tamanho++;
    }

    public void inserirPosicaoEspecifica(int elemento, int posicao){

        Nodo novo = new Nodo(elemento);

        if(posicao <= 0 || posicao > this.tamanho + 1 ){

            System.out.println("Você tentou acessar uma posição fora dos limites da lista.");
            return;
        }

        if (this.primeiro == null) {
            
            if(posicao == 1){

                this.primeiro = novo;
                this.ultimo = novo;
            }else{

                System.out.println("Posição inválida");
            }

        }else{

            if(posicao == 1){

                novo.proximo = this.primeiro;
                this.primeiro = novo;
            }else if(posicao == this.tamanho + 1){

               this.ultimo.proximo = novo;
               this.ultimo = novo;
            }else{

                Nodo aux = this.primeiro;
                int cont = 1;

                while(cont < posicao -  1){

                    aux = aux.proximo;
                    cont++;
                }

                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }

        }
        tamanho++;
        
    }

    public void removerIncio(){

        if(this.primeiro == null){

            System.out.println("A lista está vazia!");
            return;
        }

        if (this.tamanho ==  1) {
            
            this.primeiro = null;
            this.ultimo = null;
        }else{

            this.primeiro = this.primeiro.proximo;
        }

        tamanho--;
    }

    public void removerFinal(){

        if(this.primeiro == null){

            System.out.println("Sua lista está vazia!");
            return;
        }

        if(this.tamanho == 1){

            this.primeiro = null;
            this.ultimo = null;
        }else{

            Nodo aux = this.primeiro;

            while(aux.proximo.proximo != null){

                aux = aux.proximo;
            }

            this.ultimo = aux;
            aux.proximo = null;
        }

        tamanho--;
    }

    public void removerPosicaEspecifica(int posicao){

        if(posicao <= 0 || posicao > this.tamanho + 1){

            System.out.println("Você tentou acessar uma posição fora dos limites da lista.");
            return;
        }

        if(this.primeiro == null){

            if(posicao == 1){

                this.primeiro = null;
                this.ultimo = null;
            }else{

                System.out.println("Posição inválida");
            }
        }else{

            if(posicao == 1){

                this.primeiro = this.primeiro.proximo;
            }else if(posicao == this.tamanho + 1){

                Nodo aux = this.primeiro;
                int cont = 1;

                while(posicao < posicao -1){
                    
                    aux = aux.proximo;
                    cont++;
                }

                this.ultimo = aux;
                aux.proximo = null;

            }else {

                Nodo aux = this.primeiro;
                int cont = 1;

                while (posicao < posicao - 1) {
                    
                    aux = aux.proximo;
                    cont++;
                }

                aux.proximo = aux.proximo.proximo;

            }
        }

    }
}
