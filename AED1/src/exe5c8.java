import java.util.Scanner;
public class exe5c8 {
	public static void main(String[] args) {
	int voto, cont1, cont2, cont3;
	cont1 = 0;
	cont2 = 0;
	cont3 = 0;
	System.out.println("O programa vai informar qual candidato ganhou");
	Scanner teclado = new Scanner(System.in);
	 for(int rep=1; rep<=100; rep++) {
		 System.out.print("Informe o voto(Fulano=1,Ciclano=2,Beltrano=3)");
	     voto = teclado.nextInt();
	     if(voto==1) {
	    	 cont1++;
	     }else
	    	 if(voto==2) {
	    		 cont2++;
	    	 }else
	    		 if(voto==3) {
	    			 cont3++;
	    		 }else
	    			 System.out.println("Voto inválido");
	 }
	 System.out.println("Fulano = " +cont1);
	 System.out.println("Ciclano = " +cont2);
	 System.out.println("Beltrano = " +cont3);
	 teclado.close();
	}

}
