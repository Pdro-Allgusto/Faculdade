import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private double mediaGeral;
    private int status;
    private List<Disciplina> disciplinasCursadas;
    private List<Disciplina> disciplinasACursar;

    public Aluno(String nome, String endereco, String telefone, String cpf, String matricula, Curso curso, double mediaGeral, int status) {
        super(nome, endereco, telefone, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.mediaGeral = mediaGeral;
        this.status = status;
        this.disciplinasCursadas = new ArrayList<>();
        this.disciplinasACursar = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public List<Disciplina> getDisciplinasACursar() {
        return disciplinasACursar;
    }
}
