public class Funcionario extends Pessoa {
    private double fatorSalario;

    public Funcionario(String nome, String endereco, String telefone, String cpf, double fatorSalario) {
        super(nome, endereco, telefone, cpf);
        this.fatorSalario = fatorSalario;
    }

    public double getFatorSalario() {
        return fatorSalario;
    }

    public void setFatorSalario(double fatorSalario) {
        this.fatorSalario = fatorSalario;
    }
}
