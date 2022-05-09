package funcionarios;

public class Pilha {

    private Funcionario[] funcionarios = new Funcionario[100];

    private int totalDeFuncionarios = 0;

    public boolean isEmpty() {
        if (this.size() == 0)
            return true;
        return false;
    }

    public void push(Funcionario f) {
        if (size() < funcionarios.length) {
            this.funcionarios[this.totalDeFuncionarios] = f;
            this.totalDeFuncionarios++;
        } else {
            System.out.println("A pilha está cheia");
        }
    }

    public Funcionario pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Pilha vazia.");
        }
        this.totalDeFuncionarios--;
        return this.funcionarios[totalDeFuncionarios];
    }

    public boolean contain(String nome) {
        for (int i = 0; i < this.totalDeFuncionarios; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void print() {

        System.out.println("\n=================================================");
        System.out.println(" RELATÓRIO DE FUNCIONÁRIOS");
        System.out.println("=================================================");
        if (!isEmpty()) {
            for (int i = this.totalDeFuncionarios - 1; i >= 0; i--) {
                System.out.printf("%d - %s - R$ %.2f\n",
                        (totalDeFuncionarios - i),
                        funcionarios[i].getNome(),
                        funcionarios[i].getSalario());
            }

        } else {
            System.out.println("Não existem funcionários cadastrados.");
        }
        System.out.println("=================================================\n");
    }

    public int size() {
        return this.totalDeFuncionarios;
    }


}
