import java.util.Scanner;
public class exe4c7 {
	public static void main(String[] args) {
	String time;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai falar de onde o time é");
	System.out.print("Informe seu time: ");
	time = teclado.nextLine();
	switch (time) {
	case "América": case"Atlético": case"Cruzeiro": case"Villa Nova": 
		System.out.println("Minas Gerais");
		break;
	case "Botafogo": case"Flamengo": case"Fluminense": case"Vasco":
		System.out.println("São Paulo");
		break;
	case "Corinthians": case"Palmeiras": case"Santos": case"São Paulo":
		System.out.println("Juventude");
		break;
	case "Grêmio": case "Internacional": case "Juventude":
		System.out.println("Rio Grande do Sul");
		break;
	case "Náutico": case "Santa Cruz": case "Sport":
		System.out.println("Pernambuco");
		break;
	default:
		System.out.println("Não sei");
		break;
	}
	teclado.close();

	
	
	
	
	
	}

}
