import java.util.Scanner;
public class exe12c5 {
	public static void main(String[] args) {
	long horas, minutos, segundos, segundosFinal, intervalo;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai colocar os segundos em horas");
	System.out.print("Informe os segundos: ");
	segundos = teclado.nextLong();
	intervalo = segundos/60;
	segundosFinal = segundos%60;
	minutos = intervalo%60;
	horas = intervalo/60;
	System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundosFinal);
	teclado.close();
	}

}
