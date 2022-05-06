import java.util.Scanner;

public class exe2c10 {

	public static void main(String[] args) {
	double valor, valorT = 0,media;
	long cont = 0 ,valorA = 0;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Para finalizar digite 0 no valor recebido");
	do {
		System.out.print("Informe o valor recebido: ");
		valor = teclado.nextDouble();
		if(valor!=0) {
			valorT+= valor;
			cont++;
			if(valor>1000) {
				valorA++;
			}
		}

	} while (valor != 0);
	media = valorT/cont;
	System.out.println("Valor total recebido = "+valorT);
	System.out.println("Média dos valores recebidos = "+media);
	System.out.println("Quantidade de valores acima de R$1000.00 = "+valorA);
	teclado.close();
	
	}

}
