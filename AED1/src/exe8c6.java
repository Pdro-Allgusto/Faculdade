import java.util.Scanner;
public class exe8c6 {
	public static void main(String[] args) {
	double  altura, pesoMin, pesoMax;
	String nome;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai os calcular pesos mínimo e máximo para que ela esteja dentro da faixa de peso ideal de acordo com a tabela de IMC ");
	System.out.print("Informe o seu nome");
	nome = teclado.nextLine();
	System.out.print("Informe sua altura em metros: ");
	altura = teclado.nextDouble();
	pesoMin=20*Math.pow(altura, 2);
	pesoMax=25*Math.pow(altura, 2);
	System.out.println(nome+" peso Mínimo: "+pesoMin+"peso Máximo: "+pesoMax);
	teclado.close();
	}

}
