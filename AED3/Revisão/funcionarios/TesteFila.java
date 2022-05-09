package funcionarios;

public class TesteFila {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("André Gomes Cavalcanti", 1500.00);
        Funcionario f2 = new Funcionario("Pedro Paulo Santos", 5500.75);
        Funcionario f3 = new Funcionario("Mariana Pereira Souza", 2500.5);
        Funcionario f4 = new Funcionario("Gustavo Câmara Ferreira", 1850.2);
        Funcionario f5 = new Funcionario("Mariana Silva Ramos", 2870.00);

        Fila funcionarios = new Fila();

        funcionarios.enqueue(f1);
        funcionarios.enqueue(f2);
        funcionarios.enqueue(f3);
        funcionarios.enqueue(f4);
        funcionarios.enqueue(f5);

        funcionarios.print();

        System.out.println(funcionarios.contain("Vinicius De Filippo"));
        System.out.println(funcionarios.contain("MARIANA PEREIRA SOUZA"));

        // Retirando todos os funcionários da fila
        while (!funcionarios.isEmpty()) {
            System.out.println(funcionarios.dequeue().getNome());
        }
        funcionarios.print();

        // Removendo um funcionário pelo nome
        funcionarios.enqueue(f1);
        funcionarios.enqueue(f2);
        funcionarios.enqueue(f3);
        funcionarios.enqueue(f4);
        funcionarios.enqueue(f5);

        Fila funcionarios2 = new Fila();

        while (!funcionarios.isEmpty()) {
            Funcionario f = funcionarios.dequeue();
            if (!f.getNome().equals("Gustavo Câmara Ferreira")) {
                funcionarios2.enqueue(f);
            }
        }
        funcionarios2.print();

    }
}
