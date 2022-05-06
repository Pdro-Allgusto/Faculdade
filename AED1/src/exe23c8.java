
public class exe23c8 {

	public static void main(String[] args) {
	double serie,soma = 0;
	for(int aux=1; aux<=99; aux+=2) {
		soma +=Math.pow(2, aux);
		//System.out.println("Valor da Soma = "+soma);
	}
	serie = soma*(1.0/3);
	System.out.println("Valor da Série = "+serie);
	}

}
