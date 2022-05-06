import java.util.Scanner;
public class exe17c8 {
	public static void main(String[] args) {
	int numero, resultado;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um número inteiro de 1 a 9: ");
    numero = teclado.nextInt();
    for(int aux=1; aux<=9; aux++) {
    	resultado = numero * aux;
    	System.out.println(aux+" x "+numero+" = "+resultado);	
    }
	teclado.close();
	}

}
