import java.util.Scanner;

public class exe10c13 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome;
		System.out.print("Informe o nome completo de uma pessoa: ");
		nome= teclado.nextLine();
		 String palavras[] = nome.split("");
		 for (int x=0; x<palavras.length; x++) {
			 System.out.println(palavras[x]);
	}
    teclado.close();
	}

}
