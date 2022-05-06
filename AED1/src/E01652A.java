
//Pedro Augusto Morais
import java.util.Scanner;

public class E01652A {
    public static void main(String[] args) {
        double diametro, altura, pi, raio, area, volume, horas, enchimento;
        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "O programa vai falar o tempo em horas que po�o artesiano levar� para encher a piscina eo tamanho da lona circular");
        System.out.print("Informe a altura da piscina: ");
        altura = teclado.nextDouble();
        System.out.print("Informe o di�metro da piscina: ");
        diametro = teclado.nextDouble();
        pi = 3.1416;
        raio = diametro / 2;
        area = pi * Math.pow(raio, 2);
        volume = area * (altura - 0.1);
        enchimento = 2.7;
        horas = volume / enchimento;
        System.out.println("Lona circular em m2 = " + area + "\nTempo em horas = " + horas);
        teclado.close();
    }

}
