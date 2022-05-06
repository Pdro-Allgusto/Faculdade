
public class exe18c8 {

	public static void main(String[] args) {
	double resultado;
	int valorInt ,soma = 0;
	for(int aux=1; aux<=100; aux++) {
		resultado = Math.pow(aux,2);
		valorInt = (int)resultado;
		soma += resultado;
		System.out.println(valorInt);
	}
	System.out.println("Soma = "+soma);
	}

}
