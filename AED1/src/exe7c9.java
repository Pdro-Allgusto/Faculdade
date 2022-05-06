
public class exe7c9 {

	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 6; aux++) {
			num = (aux * 2 - 2) + (aux * 3);
			den = aux * 6 + 1;
			serie += num / den;
		}
		System.out.print("Valor da Série = " + serie);

	}

}
