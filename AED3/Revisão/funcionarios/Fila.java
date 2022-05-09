package funcionarios;

public class Fila {

    private Funcionario[] funcionarios = new Funcionario[100];

    private int totalDeFuncionarios = 0;

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public void enqueue(Funcionario f) {
        if (size() < funcionarios.length) {
            this.funcionarios[this.totalDeFuncionarios] = f;
            this.totalDeFuncionarios++;
        } else {
            System.out.println("A fila está cheia");
        }
    }

    public Funcionario dequeue() {

        if (isEmpty()) {
            throw new IllegalArgumentException("Fila vazia.");
        }

        Funcionario f = this.funcionarios[0];
        for (int i = 0; i < this.totalDeFuncionarios - 1; i++) {
            this.funcionarios[i] = this.funcionarios[i + 1];
        }
        this.totalDeFuncionarios--;
        return f;
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
            for (int i = 0; i < size(); i++) {
                System.out.printf("%d - %s - R$ %.2f\n",
                        (i + 1),
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
