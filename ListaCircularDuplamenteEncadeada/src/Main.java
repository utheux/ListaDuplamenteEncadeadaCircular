import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[1000];
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        for (int i = 0; i < 1000; i++){
            numeros[i] = random.nextInt(19999) - 9999;
        }

        for (int numero : numeros){
            lista.insereValor(numero);
        }


        lista.imprimeOrdemCrescente();
        lista.imprimeOrdemDecrescente();


    }
}
