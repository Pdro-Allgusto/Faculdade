import java.util.Scanner;
public class exe14c8 {
	public static void main(String[] args) {
	int rep;
	String caracter;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um simbolo qualquer: ");
    caracter = teclado.nextLine();
	System.out.print("Informe um número n (entre 1 e 20): ");
    rep = teclado.nextInt();
    for (int aux2=1; aux2<=rep; aux2++) {
        for (int aux=1; aux>=rep; aux++)              
            System.out.print(caracter+" ");
        System.out.println();
      }
	teclado.close();
	}

}
