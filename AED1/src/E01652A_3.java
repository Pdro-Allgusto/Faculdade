//Pedro Augusto Morais

import java.util.Scanner;

public class E01652A_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo, nomeP = "";
        int idade, cont = 0, contM = 0, contS = 0;
        Double salario, peso, media, soma = 0.0, pesoP = 999.9;
        do {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Informe a idade: ");
                idade = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Informe o sexo (M = masculino, F = feminino): ");
                sexo = teclado.nextLine();
                System.out.print("Informe o sal�rio: ");
                salario = teclado.nextDouble();
                System.out.print("Informe o peso: ");
                peso = teclado.nextDouble();
                teclado.nextLine();
                cont++;
                if (sexo.equalsIgnoreCase("m")) {
                    contM++;
                    soma += salario;
                } else if (sexo.equalsIgnoreCase("f")) {
                    if (pesoP > peso) {
                        nomeP = nome;
                        pesoP = peso;
                    }
                }
                if (idade >= 25 && idade <= 40) {
                    if (salario < 940) {
                        contS++;
                    }
                }
            }
        } while (!nome.equalsIgnoreCase("fim"));
        media = soma / contM;
        System.out.println("Quantidade de pessoas pesquisada = " + cont);
        System.out.println("Sal�rio m�dio dos homens = " + media);
        System.out.println("Quantidade de pessoas com idade entre 25 e 40 anos cujo sal�rio � inferior a R$940,00 = " + contS);
        System.out.println("Nome da mulher mais magra = " + nomeP);
        teclado.close();
    }

}
