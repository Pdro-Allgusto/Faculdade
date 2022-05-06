//Pedro Augusto Morais

import java.util.Scanner;

public class E01652B_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[100];
        long codigo[] = new long[100];
        long temp;
        String tempN;
        for (int aux = 0; aux < 100; aux++) {
            System.out.print("Informe o nome: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Informe o c�digo: ");
            codigo[aux] = teclado.nextLong();
            teclado.nextLine();
        }
        for (int aux = 0; aux < 99; aux++) {
            for (int x = 0; x < 99; x++) {
                if (codigo[x] > codigo[x + 1]) {
                    temp = codigo[x];
                    codigo[x] = codigo[x + 1];
                    codigo[x + 1] = temp;
                    tempN = nome[x];
                    nome[x] = nome[x + 1];
                    nome[x + 1] = tempN;
                }
            }
        }
        for (int aux = 0; aux < 100; aux++) {
            if (codigo[aux] >= 1001 && codigo[aux] <= 1100) {
                System.out.println("Livros = "+nome[aux]);
            }
        }
        teclado.close();
    }

}

