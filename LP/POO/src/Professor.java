public class Professor extends Funcionario {
    private int titulacao;
    private String areaPesquisa;

    public Professor(String nome, String endereco, String telefone, String cpf, double fatorSalario, int titulacao, String areaPesquisa) {
        super(nome, endereco, telefone, cpf, fatorSalario);
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
    }

    public int getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }
}
