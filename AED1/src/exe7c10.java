import java.util.Scanner;

public class exe7c10 {

	public static void main(String[] args) {
	long populacao,ano,mes,anoR,dia,tempo=0;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe a quantidade de pessoas que vivem na região: ");
	populacao = teclado.nextLong();
	do {
		populacao-=populacao*0.003/100;
		tempo++;
	}while(populacao!=0);
	ano=tempo/365;
	anoR=tempo%365;
	mes=anoR/30;
	dia=anoR%30;
    System.out.println("Anos = "+ano+" Meses = "+mes+ " Dia = "+dia);
	teclado.close();

	}

}
