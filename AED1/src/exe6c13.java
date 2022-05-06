import java.util.Scanner;

public class exe6c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome,familia,temp;
		int cont=0;
		System.out.print("Informe o nome de uma família: ");
		familia = teclado.nextLine();
		for (int aux1=0; aux1<100; aux1++) {
			System.out.print("Informe o nome completo de uma pessoa: ");
			nome= teclado.nextLine();
			 String palavras[] = nome.split(" ");
			 for (int x=palavras.length-1; x>=0; x--) {
				 if(palavras[x].equalsIgnoreCase(familia)) {
					 cont++;
					 break;
				 }else
					 break;
			 }
		}
		System.out.println("Número de pessoas que podem ser desta família = "+cont);
	    teclado.close();
	}

}
