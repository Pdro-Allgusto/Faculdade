import java.util.Scanner;
public class exe22c8 {
	public static void main(String[] args) {
	int soma = 0,cont = 0, a, b, c, d;
	double media;
	Scanner teclado = new Scanner(System.in);
	for(int aux=1000; aux<=9999; aux++) {
		a =aux/1000;
		b = aux/100%10;
		c = aux/10%10;
		d = aux%10;
		if(a==d && b ==c) {
			soma += aux;
			cont++;
		}
	}
	media =(float) soma/cont;
	System.out.println("Média = "+media);
	teclado.close();
	}

}
