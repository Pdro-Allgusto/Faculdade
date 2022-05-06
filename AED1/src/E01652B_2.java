// Pedro Augusto Morais
import java.util.Scanner;

public class E01652B_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String codigo;
        int numero, numeroM = 0, cont = 0, cont2 = 0;
        double valor, valorM = 0, soma = 0, media;
        for (int aux = 1; aux <= 67; aux++) {
            System.out.println("Informe o c�digo do tipo de gasto (�E�, �A�, ou �I�): ");
            codigo = teclado.nextLine();
            System.out.println("Informe o valor gasto: ");
            valor = teclado.nextDouble();
            System.out.println("Informe o n�mero do c�digo: ");
            numero = teclado.nextInt();
            teclado.nextLine();
            if (codigo.equalsIgnoreCase("e")) {
                if (valor < 500) {
                    cont++;
                } else
                    System.out.println("ACIMA DO VALOR M�XIMO");
            } else if (codigo.equalsIgnoreCase("a")) {
                if (valor < 300) {
                    cont++;
                } else
                    System.out.println("ACIMA DO VALOR M�XIMO");
            } else if (codigo.equalsIgnoreCase("i")) {
                if (valor < 1000) {
                    cont++;
                } else
                    System.out.println("ACIMA DO VALOR M�XIMO");

            } else {
                System.out.println("C�digo n�o encontrado");
            }
            if (aux == 1 || valor < valorM) {
                valorM = valor;
                numeroM = numero;
            }
            if (valor < 100) {
                soma += valor;
                cont2++;
            }

        }
        media = soma / cont2;
        System.out.println("M�dia dos valores dos cheques para IMPOSTOS com valor at� R$100,00 = " + media);
        System.out.println("Quantidade de cheques cujos valores est�o abaixo do valor m�ximo = " + cont);
        System.out.println("N�mero do cheque de menor valor = " + numeroM);
        teclado.close();
    }

}
