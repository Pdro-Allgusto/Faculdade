
public class exe26c8 {

	public static void main(String[] args) {
		double dobro ;
		for (int aux3 = 1; aux3 <= 10; aux3++) {
			for (int aux2 = 1; aux2 <= 8; aux2++) {
				dobro = Math.pow(aux2, 3);
				for (int aux = 1; aux <= dobro; aux++)
					System.out.print("* ");
				System.out.println();
			}
			for (int aux2 = 8; aux2 >= 1; aux2--) {
				dobro = Math.pow(aux2, 3);
				for (int aux = 1; aux <= dobro; aux++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}

}
