public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Inserções
        lista.InserirInicio(10);
        lista.InserirFinal(20);
        lista.InserirFinal(30);
        lista.InserirPosicaoEspecifica(15, 2); // insere na posição 2
        lista.ExibirLista();

        // Remoções
        lista.RemoverInicio();
        lista.ExibirLista();

        lista.RemoverFinal();
        lista.ExibirLista();

        lista.RemoverPosicaoEspecifica(2);
        lista.ExibirLista();

        lista.InserirFinal(40);
        lista.InserirFinal(50);
        lista.InserirFinal(60);
        lista.ExibirLista();

        lista.RemoverElemento(50);
        lista.ExibirLista();

        // Pesquisa
        lista.PesquisarElemento(40);
        lista.PesquisarElemento(99);

        // Número de elementos
        System.out.println("Número de elementos na lista: " + lista.NumeroElementos());
    }
}
