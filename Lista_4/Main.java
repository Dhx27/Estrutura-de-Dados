package Lista_4;

public class Main {

    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada lista =  new ListaDuplamenteEncadeada();

        lista.inserirInicio(1);
        lista.inserirFinal(3);
        lista.inserirInicio(2);
        lista.exibirLista();
        lista.exibirElementoPosicao(3);
        lista.contarElemento();
    }
}