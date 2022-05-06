import java.util.Scanner;
public class exe2c6 {
	public static void main(String[] args) {
	double multa, poluentes;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai colocar a multa de acordo com a quantidade de poluentes");
	System.out.print("Coloque o valor de poluentes: ");
	poluentes = teclado.nextDouble();
	if(poluentes<1500)
		multa = 0;
	else
		if(poluentes<3500)
			multa = 3000;
		else
			multa = 5000*poluentes;
	System.out.println("a multa a ser paga sera de: "+ multa+" reais.");
	teclado.close();
	}

}
