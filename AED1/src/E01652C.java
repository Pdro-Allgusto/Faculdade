
//Pedro Augusto Morais
import java.util.Scanner;

public class E01652C {
    public static void main(String[] args) {
        int pagamento, vencimento, data;
        double preco, valor;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("O programa vai informar quanto o cliente vai pagar de acordo com a tabela da loja");
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe o dia do pagamento: ");
        pagamento = teclado.nextInt();
        System.out.print("Informe o dia do vencimento: ");
        vencimento = teclado.nextInt();
        System.out.print("Informe o pre�o do produto: ");
        preco = teclado.nextInt();
        data = pagamento - vencimento;
        if (data <= 0) {
            valor = preco * .9;
        } else if (data <= 5) {
            valor = preco * 1;
        } else
            valor = preco + (preco * data * 0.02);
        System.out.println(nome);
        System.out.println("Valor a ser pago " + valor);
        teclado.close();
    }

}
