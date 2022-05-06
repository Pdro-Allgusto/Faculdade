//Pedro Augusto Morais

import java.util.Scanner;

public class E01652C_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.print("Informe o nome completo de uma pessoa: ");
        nome = teclado.nextLine();
        String palavras[] = nome.split(" ");
        System.out.print(palavras[palavras.length - 1] + ", ");
        System.out.print(palavras[0]);
        teclado.close();
    }

}
