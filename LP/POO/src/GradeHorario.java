import java.util.ArrayList;
import java.util.List;

public class GradeHorario {
    private Curso curso;
    private int semestre;
    private int ano;
    private String turno;
    private List<HorarioAula> horariosAula;

    public GradeHorario(Curso curso, int semestre, int ano, String turno) {
        this.curso = curso;
        this.semestre = semestre;
        this.ano = ano;
        this.turno = turno;
        this.horariosAula = new ArrayList<>();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<HorarioAula> getHorariosAula() {
        return horariosAula;
    }
}
