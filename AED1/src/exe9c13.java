import java.util.Scanner;

public class exe9c13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;

		System.out.print("Informe uma frase: ");
		frase = teclado.nextLine();
		
		
		
		frase = frase.substring(0, 1).toUpperCase().concat(frase.substring(1));
		
		
		System.out.print(frase);

		teclado.close();
	}

}
//