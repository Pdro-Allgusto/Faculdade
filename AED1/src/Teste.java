import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
    	double rend, total = 0;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para finalizar digite ZZZ no nome");           
        do {
          System.out.print("Informe o nome do aluno: ");
          nome = teclado.nextLine();
          if (!nome.equalsIgnoreCase("ZZZ")) {
             System.out.print("Informe o rendimento familiar: ");
             rend = teclado.nextDouble();
             teclado.nextLine();
             total += rend;
          }
        } while (!nome.equalsIgnoreCase("ZZZ")); 
        System.out.println("Soma dos rendimentos = "+total);
        teclado.close();

    }
}