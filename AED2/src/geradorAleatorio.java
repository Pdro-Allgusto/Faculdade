package Ordenacao;

import java.util.Random;

public class geradorAleatorio {
    public int[] geradorAleatorio(int qtde, int interval) {
        Random gerador = new Random();
        int[] numeros = gerador.ints(0, interval).limit(qtde).toArray();
        return (numeros);
    }
}
