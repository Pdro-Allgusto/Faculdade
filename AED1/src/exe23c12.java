import java.util.Scanner;

public class exe23c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int placa[] = new int[100];
	String nome[] = new String[100];
	int numero,lugar=0,placaD;
	String dono;
	for (int aux = 0; aux < 100; aux++) {
		System.out.print("Informe o nome: ");
		nome[aux] = teclado.nextLine();
		System.out.print("Informe a placa do carro: ");
		placa[aux] = teclado.nextInt();
		teclado.nextLine();
	}
	System.out.print("Informe se vai procurar pelo nome ou a placa(1 = nome 2 = placa): ");
	numero = teclado.nextInt();
	if(numero==1) {
		System.out.print("Informe um nome que deseja encontrar: ");
		dono = teclado.nextLine();
		for (int aux = 0; aux < 100; aux++) {
			if(nome[aux].equalsIgnoreCase(dono)) {
				lugar=aux+1;
				System.out.println("O número da sua vaga é = "+lugar);
			}
				
		}
	}	
	if(numero==2) {
		System.out.print("Informe a placa que deseja encontrar: ");
		placaD = teclado.nextInt();
		for (int aux = 0; aux < 100; aux++) {
			if(placa[aux]==placaD) {
				lugar=aux+1;
				System.out.println("O número da sua vaga é = "+lugar);
			}
				
		}
	}
	teclado.close();
	}

}
