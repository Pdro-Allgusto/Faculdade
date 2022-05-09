package funcionarios;

public class TesteLista {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("André Gomes Cavalcanti", 1500.00);
        Funcionario f2 = new Funcionario("Pedro Paulo Santos", 5500.75);
        Funcionario f3 = new Funcionario("Mariana Pereira Souza", 2500.5);
        Funcionario f4 = new Funcionario("Gustavo Câmara Ferreira", 1850.2);
        Funcionario f5 = new Funcionario("Mariana Silva Ramos", 2870.00);

        Lista funcionarios = new Lista();

        funcionarios.adiciona(f1);
        funcionarios.adiciona(f2);
        funcionarios.adiciona(f3);
        funcionarios.adiciona(f4);
        funcionarios.adiciona(f5);

        funcionarios.ordenaPorNome();
        funcionarios.imprimeLista();

        System.out.println(funcionarios.contem("Vinicius De Filippo"));
        System.out.println(funcionarios.contem("Mariana Pereira Souza"));

        try {
            System.out.println((funcionarios.busca(22)).getNome());
        } catch (Exception e) {
            System.out.println("Erro: Posição inválida.");
        }



        try {
            funcionarios.remove(1);
            funcionarios.remove(22);
        } catch (Exception e) {
            System.out.println(e);
        }

        funcionarios.imprimeLista();


    }
}
