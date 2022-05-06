import java.util.Scanner;
public class exe11c6 {
	public static void main(String[] args) {
	long placar1, placar2;
	String time1, time2;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular os pontos de um jogo de volei");
	System.out.print("Coloque o nome do primeiro time: ");
	time1 = teclado.nextLine();
	System.out.print("Coloque o nome do segundo time: ");
	time2 = teclado.nextLine();
	System.out.print("Coloque o set do primeiro time: ");
	placar1 = teclado.nextLong();
	System.out.print("Coloque o set do segundo time: ");
	placar2 = teclado.nextLong();
	if(placar1 == 3) {
		if(placar2 == 2) {
			System.out.println("Equipe 1: "+time1+" pontos: 2"+"\nEquipe2: "+time2+" pontos: 1");
		}else
				System.out.println("Equipe 1: "+time1+" pontos: 3"+"\nEquipe2: "+time2+" pontos: 0");
	}else
		if(placar2 == 3) {
			if(placar1 == 2) {
				System.out.println("Equipe 1: "+time1+" pontos: 1"+"\nEquipe2: "+time2+" pontos: 2");
			}else
					System.out.println("Equipe 1: "+time1+" pontos: 0"+"\nEquipe2: "+time2+" pontos: 3");
		}
	teclado.close();
	}

}
