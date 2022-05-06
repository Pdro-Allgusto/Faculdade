import java.util.Scanner;
public class exe7c6 {
	public static void main(String[] args) {
	double salario, bruto, liquido, impostoRenda;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a distribuição dos lucros de uma empresa semestralmente");
	System.out.print("Coloque o seu salário: ");
	salario = teclado.nextDouble();
	if(salario<300)
		bruto=500+salario*0.7;
	else
		if(salario<1000)
			bruto=200+salario*0.5;
		else
			bruto=salario*0.3;
	impostoRenda = bruto*0.25;
	liquido=bruto-impostoRenda;
	System.out.println("Liquido: "+liquido);
	teclado.close();
	}

}
