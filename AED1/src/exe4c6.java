import java.util.Scanner;
public class exe4c6 {
	public static void main(String[] args) {
	double imc, altura, peso;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o seu IMC");
	System.out.print("Coloque a sua altura em metros: ");
	altura = teclado.nextDouble();
	System.out.print("Coloque o seu peso em Kg: ");
	peso = teclado.nextDouble();
	imc = peso/Math.pow(altura, 2);
	if(imc<18)
		System.out.println("Pessoa est� desnutrida");
	else
		if(imc<20)
			System.out.println("Pessoa est� abaixo do peso");
		else
			if(imc<25)
				System.out.println("Pesssoa est� no peso ideal");
			else
				if(imc>27)
					System.out.println("Pessoa est� obesa");
				else
					System.out.println("Pessoa est� acima do peso");
	teclado.close();		
	}

}
