package Ordenacao;

public class exibirVetor {
    public String exibirVetor(int[] vet) {
    String strVet = "";
    for (int i = 0; i < vet.length; i++) {
        strVet += vet[i] + " ";
    }
    return (strVet);
}
}
