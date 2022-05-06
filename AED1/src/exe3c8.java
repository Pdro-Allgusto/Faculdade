import java.util.Scanner;
public class exe3c8 {
	public static void main(String[] args) {
	int falta, cont, cont2;
	double nota;
	cont = 0;
	System.out.println("O programa vai informar se o aluno passou ou não");
	Scanner teclado = new Scanner(System.in);
	 for(int rep=1; rep<=50; rep++) {
		 System.out.print("Informe a nota: ");
	     nota = teclado.nextDouble();
	     System.out.print("Informe a quantidade de faltas: ");
	     falta = teclado.nextInt();
	     if(nota == -1) {
	    	 break;
	     }else
	    	 if(nota>=65 && falta<16) {
	    		 System.out.println("Aluno aprovado");
	    		 cont++;
	    	 }else
	    		 System.out.println("Aluno reprovado");
		         System.out.println("---------------------------------------------");
	 }
	 cont2 = 50-cont;
	 System.out.println("Alunos aprovados = " +cont);
	 System.out.println("Alunos reprovados = " +cont2);
	 System.out.println("O programa acabou");
	 teclado.close();
	}

}
