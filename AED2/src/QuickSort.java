package Ordenacao;

public class QuickSort {
    public int[] QuickSort(int[] vet, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vet, inicio, fim);
            QuickSort(vet, inicio, posicaoPivo - 1);
            QuickSort(vet, posicaoPivo + 1, fim);
        }
        return (vet);
    }

    private int separar(int[] vet, int inicio, int fim) {
        int pivo = vet[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vet[i] <= pivo) {
                i++;
            } else if (pivo < vet[f]) {
                f--;
            } else {
                int troca = vet[i];
                vet[i] = vet[f];
                vet[f] = troca;
                i++;
                f--;
            }
        }
        vet[inicio] = vet[f];
        vet[f] = pivo;
        return (f);
    }
}
