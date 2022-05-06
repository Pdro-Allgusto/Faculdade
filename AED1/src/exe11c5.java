import java.util.Scanner;
public class exe11c5 {
	public static void main(String[] args) {
	long banco, agencia, sequencial, numeroCheque;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa separa o código da agência e o sequencial do cheque do cheque: ");
	System.out.print("Informe o número do cheque: ");
	numeroCheque = teclado.nextLong();
	banco = numeroCheque/1000000;
	agencia = numeroCheque/1000%1000;
	sequencial = numeroCheque%1000;
	System.out.println("Número do cheque: "+numeroCheque+"\nBanco: "+banco+"\nAgência: "+agencia+"\nSequencial: "+sequencial);
	teclado.close();
	}

}
