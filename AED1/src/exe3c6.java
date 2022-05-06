import java.util.Scanner;
public class exe3c6 {
	public static void main(String[] args) {
	double vendas, salario, comissao, valorFixo;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o valor de comissão");
	System.out.print("Coloque o valor de vendas: ");
	vendas = teclado.nextDouble();
	if(vendas<1000)
		comissao = 0;
	else
		if(vendas<10000)
			comissao = vendas*0.10;
		else
			comissao = 1000;
	valorFixo = 240;
	salario = valorFixo + comissao;
	System.out.println("O salário vai ser: "+salario);
	teclado.close();
	}

}
