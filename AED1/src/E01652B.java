
//Pedro Augusto Morais
import javax.swing.JOptionPane;

public class E01652B {
    public static void main(String[] args) {
        long ano, curso, aluno, tempo;
        String cursando;
        String registro = JOptionPane.showInputDialog(null, "Digite seu cod�go do RA:", "Questionario",
                JOptionPane.QUESTION_MESSAGE);
        long ra = Long.valueOf(registro).longValue();
        ano = ra / 10000;
        curso = ra / 1000 % 10;
        aluno = ra % 1000;
        tempo = 2021 - ano;
        if (curso == 1) {
            cursando = "Direito";
        } else if (curso == 2) {
            cursando = "Engenharia Civil";
        } else if (curso == 3) {
            cursando = "Computa��o";
        } else
            cursando = "Arquitetura";
        JOptionPane.showMessageDialog(null,
                "Curso: " + cursando + "\nSequencial: " + aluno + "\nAnos de escola: " + tempo, "Questionario",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
