package funcionarios;

public class Lista {

    // Declarando e Inicializando um array/vetor
    // de Funcionario com capacidade 100.
    private Funcionario[] funcionarios = new Funcionario[100];

    private int totalDeFuncionarios = 0;

    public void adiciona(Funcionario func) {
        this.funcionarios[totalDeFuncionarios] = func;
        this.totalDeFuncionarios++;
    }

    public Funcionario busca(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.funcionarios[posicao];
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeFuncionarios;
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeFuncionarios - 1; i++) {
            this.funcionarios[i] = this.funcionarios[i + 1];
        }
        this.totalDeFuncionarios--;
    }

    public boolean contem(String nome) {
        for (int i = 0; i < this.totalDeFuncionarios; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeFuncionarios;
    }

    public void imprimeLista() {
        System.out.println("\n=================================================");
        System.out.println(" RELATÓRIO DE FUNCIONÁRIOS");
        System.out.println("=================================================");
        for (int i = 0; i < this.totalDeFuncionarios; i++) {
            System.out.printf("%d - %s - R$ %.2f\n",
                    (i + 1),
                    funcionarios[i].getNome(),
                    funcionarios[i].getSalario());
        }
        System.out.println("=================================================");
    }

    public int comparaStrings(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if ((int) word1.charAt(i) != (int) word2.charAt(i)) {
                return (int) word1.charAt(i) - (int) word2.charAt(i);
            }
        }
        return 0;
    }

    public void ordenaPorNome() {
        for (int i = 0; i < totalDeFuncionarios; i++) {
            for (int j = 0; j < totalDeFuncionarios - 1; j++) {
                if (comparaStrings(funcionarios[j].getNome(), funcionarios[j + 1].getNome()) > 0) {
                    Funcionario aux =  funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }
}
