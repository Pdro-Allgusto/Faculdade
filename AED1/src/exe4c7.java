import java.util.Scanner;
public class exe4c7 {
	public static void main(String[] args) {
	String time;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai falar de onde o time �");
	System.out.print("Informe seu time: ");
	time = teclado.nextLine();
	switch (time) {
	case "Am�rica": case"Atl�tico": case"Cruzeiro": case"Villa Nova": 
		System.out.println("Minas Gerais");
		break;
	case "Botafogo": case"Flamengo": case"Fluminense": case"Vasco":
		System.out.println("S�o Paulo");
		break;
	case "Corinthians": case"Palmeiras": case"Santos": case"S�o Paulo":
		System.out.println("Juventude");
		break;
	case "Gr�mio": case "Internacional": case "Juventude":
		System.out.println("Rio Grande do Sul");
		break;
	case "N�utico": case "Santa Cruz": case "Sport":
		System.out.println("Pernambuco");
		break;
	default:
		System.out.println("N�o sei");
		break;
	}
	teclado.close();

	
	
	
	
	
	}

}
