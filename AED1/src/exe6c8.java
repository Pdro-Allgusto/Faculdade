import java.util.Scanner;
public class exe6c8 {
	public static void main(String[] args) {
	int cont = 0,soma = 0,numero;
	System.out.println("O programa vai informar se o numero � par ou impar, se a soma dos n�meros divis�veis por 4 e se a quantidade de n�meros divis�veis por 3");
	Scanner teclado = new Scanner(System.in);
	for(int rep=1; rep<=10; rep++) {
		 System.out.print("Informe um n�mero: ");
	     numero = teclado.nextInt();
	     if(numero %2 == 0) {
	    	 System.out.println("N�mero par");
	    	 if(numero%4==0) {
	    		 soma += numero;
	    	 }
	     }else
	    	 System.out.println("N�mero �mpar");
	    	 if(numero%3==0) {
	    		 cont++;
	    	 }
	}
	System.out.println("Soma dos n�meros divis�veis por 4 = "+soma);
	System.out.println("Quantidade de n�meros divis�veis por 3 = "+cont);
	teclado.close();
	}

}
