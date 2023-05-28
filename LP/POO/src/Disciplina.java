public class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;
    private int ano;
    private int cargaHoraria;
    private int creditos;

    public Disciplina(String codigo, String nome, int semestre, int ano, int cargaHoraria, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.ano = ano;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
