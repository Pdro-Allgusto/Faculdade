public class Main {
    public static void main(String[] args) {
        // Criando um curso
        Curso curso = new Curso("C001", "Ciências da Computação ", 8);

        // Criando um professor
        Professor professor = new Professor("Marcos", "Rua A, 123", "(33) 2840-5240", "587.973.726-84", 1.5, 3, "Inteligência Artificial");

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("D001", "Linguagens de Programação", 1, 2023, 60, 8);
        Disciplina disciplina2 = new Disciplina("D002", "Banco de Dados", 2, 2023, 60, 8);

        // Criando um aluno
        Aluno aluno = new Aluno("Pedro", "Rua W, 450", "(38) 3273-9232", "706.206.556-07", "A001", curso, 8.5, 1);
        aluno.getDisciplinasACursar().add(disciplina1);
        aluno.getDisciplinasACursar().add(disciplina2);

        // Criando um horário de aula
        HorarioAula horarioAula = new HorarioAula("08:00", "10:00", "Segunda-feira", "Sala 101", disciplina1, professor);
        horarioAula.getAlunos().add(aluno);

        // Criando uma grade de horário
        GradeHorario gradeHorario = new GradeHorario(curso, 1, 2023, "Manhã");
        gradeHorario.getHorariosAula().add(horarioAula);

        // Exibindo informações
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.getDisciplinasACursar()) {
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println("Horários de aula do curso " + curso.getNome() + ":");
        for (HorarioAula horario : gradeHorario.getHorariosAula()) {
            System.out.println("- " + horario.getDisciplina().getNome() + " - " + horario.getDiaSemana() + " - " + horario.getSala());
        }
    }
}