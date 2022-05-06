import java.util.Scanner;

public class exe2c11 {

	public static void main(String[] args) {
	double aplicado,soma=0,media,total=0,maior=0;
	String nome,maiorN="";
	int contB=0,contO=0,contP=0;
	Scanner teclado = new Scanner(System.in);
	for (int aux = 1; aux <= 538; aux ++) {
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe o valor aplicado: ");
		aplicado = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Nome do Aplicador = "+nome+" Valor da Aplicação = "+aplicado);
		System.out.println("-----------------------------------------------------------");
		if(aplicado<=1000) {
			contB++;
			soma+=aplicado;
		}else
			if(aplicado<=5000) {
				contP++;
			}else 
				contO++;
	   total+=aplicado;
	   if(aux==1||maior>aplicado) {
		   maior=aplicado;
		   maiorN=nome;
	   }
	}
	media= soma/contB;
	System.out.println("Total de Bronze = "+contB);
	System.out.println("Total de Prata = "+contP);
	System.out.println("Total de Ouro = "+contO);
	System.out.println("Média das aplicações dos clientes Bronze = "+media);
	System.out.println("Volume total das aplicações = "+total);
	System.out.println("Nome do aplicador de menor aplicação = "+maiorN);
	teclado.close();
	}

}
