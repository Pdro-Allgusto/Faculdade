import java.util.Scanner;
public class exe9c8 {
	public static void main(String[] args) {
	int somaM = 0, contM = 0,somaF = 0,contF = 0,rep,idade;
	double mediaM, mediaF;
	String nome,sexo;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe a quantidade de pessoas: ");
    rep = teclado.nextInt();
	for(int aux=1; aux<=rep; aux++) {
		System.out.print("Informe o nome: ");
	    nome = teclado.nextLine();
	    teclado.next();
	    System.out.print("Informe a idade: ");
	    idade = teclado.nextInt();
	    System.out.print("Sexo (M ou F): ");
        sexo = teclado.nextLine();
        teclado.next();
        if (sexo.equalsIgnoreCase("f")) {
        	contF++;
        	somaF+= idade;
        }else
        	contM++;
        	somaM+= idade;
	}
	mediaF= (float)somaF/contF;
	mediaM= (float)somaM/contM;
	System.out.print("Média das idades dos homens = "+mediaM);
	System.out.print("Média das idades das mulheres = "+mediaF);
	teclado.close();
	}

}
