import java.util.Scanner;
public class exe21c8 {
	public static void main(String[] args) {
	int numero, cont = 0;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um número inteiro: ");
    numero = teclado.nextInt();
    for(int aux=1; aux<=numero; aux++) {
    	if(numero%aux==0) {
    		cont++;
    	}
    }
    if(cont++==2) {
    	System.out.println("Número primo");
    }else
    	System.out.println("Número não primo");
	teclado.close();
	}

}
