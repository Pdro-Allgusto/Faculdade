package funcionarios;

public class TestePilha {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("André Gomes Cavalcanti", 1500.00);
        Funcionario f2 = new Funcionario("Pedro Paulo Santos", 5500.75);
        Funcionario f3 = new Funcionario("Mariana Pereira Souza", 2500.5);
        Funcionario f4 = new Funcionario("Gustavo Câmara Ferreira", 1850.2);
        Funcionario f5 = new Funcionario("Mariana Silva Ramos", 2870.00);

        Pilha funcionarios = new Pilha();

        funcionarios.push(f1);
        funcionarios.push(f2);
        funcionarios.push(f3);
        funcionarios.push(f4);
        funcionarios.push(f5);

        funcionarios.print();

        System.out.println(funcionarios.contain("Vinicius De Filippo"));
        System.out.println(funcionarios.contain("MARIANA PEREIRA SOUZA"));

        // Retirando todos os funcionários da pilha
        while (!funcionarios.isEmpty()) {
            System.out.println(funcionarios.pop().getNome());
        }
        funcionarios.print();

        // Invertendo os dados da pilha original
        funcionarios.push(f1);
        funcionarios.push(f2);
        funcionarios.push(f3);
        funcionarios.push(f4);
        funcionarios.push(f5);

        Pilha funcionarios2 = new Pilha();

        while (!funcionarios.isEmpty())
            funcionarios2.push(funcionarios.pop());

        funcionarios2.print();

        // Removendo um funcionário pelo nome
        funcionarios.push(f1);
        funcionarios.push(f2);
        funcionarios.push(f3);
        funcionarios.push(f4);
        funcionarios.push(f5);

        Pilha funcionarios3 = new Pilha();

        while (!funcionarios.isEmpty()) {
            Funcionario f = funcionarios.pop();
            if (!f.getNome().equals("Gustavo Câmara Ferreira")) {
                funcionarios3.push(f);
            }
        }
        funcionarios3.print();
    }
}
