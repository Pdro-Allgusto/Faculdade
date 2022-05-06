
public class exe1c9 {

	public static void main(String[] args) {
		double num, den, serie=0;
		   for (int aux=1; aux<=37; aux++) {
		     num = (38-aux)*(39-aux);
		     den = aux;
		     serie += num / den;
		   }
		   System.out.print("Valor da Série = "+serie);
	}

}
