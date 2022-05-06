import java.util.Scanner;
public class exe2c8 {
	public static void main(String[] args) {
	int falta;
	double nota;
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
	    	 }else
	    		 System.out.println("Aluno reprovado");
		         System.out.println("---------------------------------------------");
	 }
	 System.out.println("O programa acabou");
	 teclado.close();
	}

}
