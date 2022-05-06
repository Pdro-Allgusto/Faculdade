package Ordenacao;

public class InsertionSortDecrescente {
    public int[] InsertionSortDecrescente(int[] vet) {
        int chave, j;
        for (int i = 1; i < vet.length; i++) {
            chave = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] < chave) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = chave;
        }
        return (vet);
    }
}
