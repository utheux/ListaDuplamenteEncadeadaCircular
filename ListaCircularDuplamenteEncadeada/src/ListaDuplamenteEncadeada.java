import java.sql.Struct;

public class ListaDuplamenteEncadeada {
    No sentinela;

    public ListaDuplamenteEncadeada() {
        sentinela = new No(0);
        sentinela.proximo = sentinela;
        sentinela.anterior = sentinela;
    }

    public void insereValor(int valor){
        No novoNo = new No(valor);
        No atual = sentinela.proximo;

        while (atual != sentinela && atual.valor < valor){
            atual = atual.proximo;
        }

        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
    }

    public void imprimeOrdemCrescente(){
        No atual = sentinela.proximo;
        while (atual != sentinela){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimeOrdemDecrescente(){
        No atual = sentinela.anterior;
        while (atual != sentinela){
            System.out.println(atual.valor);
            atual = atual.anterior;
        }
        System.out.println();
    }




}
