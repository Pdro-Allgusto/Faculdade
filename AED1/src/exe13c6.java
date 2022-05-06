import java.util.Scanner;
public class exe13c6 {
	public static void main(String[] args) {
	long horaI, minutosI, horaF, minutosF, horaD, minutosD, conjuntoI, conjuntoF, junto;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a diferencça enter as horas");
	System.out.print("Coloque a hora inicial: ");
	horaI = teclado.nextLong();
	System.out.print("Coloque os minutos iniciais: ");
	minutosI = teclado.nextLong();
	System.out.print("Coloque a hora terminal: ");
	horaF = teclado.nextLong();
	System.out.print("Coloque os minutos terminais: ");
	minutosF = teclado.nextLong();
	conjuntoI = horaI*60+minutosI;
	conjuntoF = horaF*60+minutosF;
	junto= conjuntoF-conjuntoI;
	horaD=junto/60;
	minutosD=junto%60;
	System.out.println("Duração: "+horaD+" horas "+minutosD+" minutos");
	teclado.close();
	}

}
