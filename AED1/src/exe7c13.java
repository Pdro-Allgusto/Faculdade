import java.util.Scanner;

public class exe7c13 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome;
	System.out.print("Informe o nome completo de uma pessoa: ");
	nome= teclado.nextLine();
	 String palavras[] = nome.split(" ");
	 for (int x=palavras.length-1; x>=0; x--) {
		 System.out.println( palavras[x]);
		 break;
	 }
	teclado.close();
	}

}
