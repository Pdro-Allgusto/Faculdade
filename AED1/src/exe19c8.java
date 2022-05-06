import java.util.Scanner;
public class exe19c8 {
	public static void main(String[] args) {
	double resultado;
	int valorInt, rep = 0;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe a quantidade de insumos consumidos no projeto: ");
    rep = teclado.nextInt();
	for(int aux=0; aux<=rep; aux++) {
		resultado = Math.pow(2,aux);
		valorInt = (int)resultado;
		System.out.println(valorInt);
	}
	teclado.close();
	}

}
