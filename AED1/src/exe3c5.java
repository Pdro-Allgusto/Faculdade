import java.util.Scanner;
public class exe3c5 {
	public static void main(String[] args) {
	long salario, dependentes, liquido;
	double impostoRenda;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o valor a ser retido de Imposto de Renda");
	System.out.print("Informe o seu salário: ");
	salario = teclado.nextLong();
	System.out.print("Informe o número de dependentes: ");
	dependentes = teclado.nextLong();
	liquido = salario-(dependentes*60);
	impostoRenda = liquido*15/100.0;
	System.out.println("Imposto de Renda : "+impostoRenda);
	teclado.close();
	}

}
