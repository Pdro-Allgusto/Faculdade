package Ordenacao;

public class MergeSort {
    public int[] MergeSort(int[] vet, int baixo, int alto) {
        if (baixo < alto) {
            int medio = (baixo + alto) / 2;
            MergeSort(vet, baixo, medio);
            MergeSort(vet, medio + 1, alto);
            Merge(vet, baixo, medio, alto);
        }
        return (vet);
    }

    private int[] Merge(int[] vet, int baixo, int medio, int alto) {
        int[] vetAux = new int[vet.length];
        for (int i = baixo; i <= alto; i++) {
            vetAux[i] = vet[i];
        }
        int vetEsquerdo = baixo;
        int vetDireito = medio + 1;
        int atual = baixo;
        while (vetEsquerdo <= medio && vetDireito <= alto) {
            if (vetAux[vetEsquerdo] <= vetAux[vetDireito]) {
                vet[atual] = vetAux[vetEsquerdo];
                vetEsquerdo++;
            } else {
                vet[atual] = vetAux[vetDireito];
                vetDireito++;
            }
            atual++;
        }
        int restante = medio - vetEsquerdo;
        for (int i = 0; i <= restante; i++) {
            vet[atual + 1] = vetAux[vetEsquerdo + 1];

        }
        return (vet);
    }
}
