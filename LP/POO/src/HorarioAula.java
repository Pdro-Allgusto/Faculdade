import java.util.ArrayList;
import java.util.List;

public class HorarioAula {
    private String horaInicial;
    private String horaFinal;
    private String diaSemana;
    private String sala;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public HorarioAula(String horaInicial, String horaFinal, String diaSemana, String sala, Disciplina disciplina, Professor professor) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.diaSemana = diaSemana;
        this.sala = sala;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
