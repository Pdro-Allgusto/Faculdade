import java.util.Scanner;
public class exe20c8 {
	public static void main(String[] args) {
	double imc, altura;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe a sua altura em metros: ");
    altura = teclado.nextDouble();
    for(int aux=60; aux<=100; aux++) {
    	imc = aux /Math.pow(altura, 2);
    	System.out.println("----------------------------------");
    	System.out.println("Peso = "+aux);
    	System.out.println("IMC = "+imc);
    	if(imc < 20) {
    		System.out.println("Abaixo do peso");
    	}else
    		if(imc < 25) {
    			System.out.println("Peso ideal");
    		}else
    			System.out.println("Acima do peso");
    }
    teclado.close();
	}

}
