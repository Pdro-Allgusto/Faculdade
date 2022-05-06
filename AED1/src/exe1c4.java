import java.util.Scanner;
public class exe1c4 {
	public static void main(String[] args) { 
		long idade;
		String primeiroNome, sobrenome, segundoNome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Primeiro Nome");
		primeiroNome = teclado.nextLine();
		System.out.print("Segundo Nome");
		segundoNome = teclado.nextLine();
		System.out.print("Sobrenome");
		sobrenome = teclado.nextLine();
		System.out.print("Idade");
		idade = teclado.nextLong();
		System.out.println(sobrenome+","+primeiroNome+" "+segundoNome+"\nIdade:"+idade+" anos.");
		teclado.close();
	}

}
