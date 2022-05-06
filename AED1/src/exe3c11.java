import java.util.Scanner;

public class exe3c11 {

	public static void main(String[] args) {
	int dia, pontos,cont=0;
	double total=0;
	String placa;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Para finalizar digite 99 no dia");
	do {
		System.out.print("Informe o dia: ");
		dia = teclado.nextInt();
		if (dia!=99) {
			teclado.nextLine();
			System.out.print("Informe a placa do carro: ");
			placa = teclado.nextLine();
			System.out.print("Informe a pontuação: ");
			pontos = teclado.nextInt();
			if(pontos==3) {
				System.out.println("Placa = "+ placa +" Valor da Multa R$42,00");
				total += 42;
			}else
				if(pontos==5) {
					System.out.println("Placa = "+ placa +" Valor da Multa R$108,00");
					total+=108;
				}else
					if(pontos==8) {
						System.out.println("Placa = "+ placa + " Valor da Multa R$479,00");
						if(dia<=15) 
							cont++;
						total+=479;
						
					}
		}
	} while (dia!=99);
	System.out.println("Quantidade de multas de pontuação 8 da primeira quinzena do mês = "+cont);
	System.out.println("Total arrecadado com as multas = "+total);
	teclado.close();
	}

}
