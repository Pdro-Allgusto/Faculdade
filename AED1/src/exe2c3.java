import java.util.Scanner;
public class exe2c3 {
	public static void main(String[] args) {
		String nome;
		int anoNasc, anoAtual, idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite o ano que voc� nasceu: ");
		anoNasc = teclado.nextInt();
		System.out.print("Digite o ano em que estamos: ");
		anoAtual = teclado.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println(nome+", voc� tem/ter� "+idade+" anoem em "+anoAtual); 
		teclado.close();
		
	}

}
