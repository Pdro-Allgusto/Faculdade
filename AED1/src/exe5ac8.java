import java.util.Scanner;
public class exe5ac8 {
	public static void main(String[] args) {
	int voto, cont1, cont2, cont3,cont4;
	cont1 = 0;
	cont2 = 0;
	cont3 = 0;
	cont4 = 0;
	System.out.println("O programa vai informar qual candidato ganhou");
	Scanner teclado = new Scanner(System.in);
	 for(int rep=1; rep<=100; rep++) {
		 System.out.print("Informe o voto(Fulano=1,Ciclano=2,Beltrano=3) = ");
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
	    			 cont4++;
	 }
	     if(cont1==cont2) {
	    	 System.out.println("Segundo turno");
	    	 cont1 = 0;
	    	 cont2 = 0;
	    	 cont3 = 0;
	    	 cont4 = 0;
	    	 for(int aux=1; aux<=100; aux++) {
	    		 System.out.print("Informe o voto(Fulano=1,Ciclano=2) = ");
	    		 voto = teclado.nextInt();
	    	     if(voto==1) {
	    	    	 cont1++;
	    	     }else
	    	    	 if(voto==2) {
	    	    		 cont2++;
	    	    	 }else
	    	    		 cont4++;
	    	     break;
	    	 }
	     }else
	    	 if(cont1==cont3){
	    		 System.out.println("Segundo turno");
		    	 cont1 = 0;
		    	 cont2 = 0;
		    	 cont3 = 0;
		    	 cont4 = 0;
	    		 for(int aux=1; aux<=100; aux++) {
	    			 System.out.print("Informe o voto(Fulano=1,Beltrano=3) = ");
		    		 voto = teclado.nextInt();
		    	     if(voto==1) {
		    	    	 cont1++;
		    	     }else
		    	    	 if(voto==3) {
		    	    		 cont3++;
		    	    	 }else
		    	    		 cont4++;
		    	     break;
	    		 }
	    	 }else
	    		 if(cont2==cont3) {
	    			 System.out.println("Segundo turno");
	    	    	 cont1 = 0;
	    	    	 cont2 = 0;
	    	    	 cont3 = 0;
	    	    	 cont4 = 0;
	    			 for(int aut=1; aut<=100; aut++) {
		    			 System.out.print("Informe o voto(Ciclano=2,Beltrano=3) = ");
			    		 voto = teclado.nextInt();
			    	     if(voto==2) {
			    	    	 cont2++;
			    	     }else
			    	    	 if(voto==3) {
			    	    		 cont3++;
			    	    	 }else
			    	    		 cont4++;
			    	     break;
	    			 }
	    		 }else
	    			 if(cont4>50) {
	    				 System.out.println("A eleição está anulada");
	    			 }else
	    				 System.out.println("Segundo turno");
		    	    	 cont1 = 0;
		    	    	 cont2 = 0;
		    	    	 cont3 = 0;
		    	    	 cont4 = 0;
	    				 for(int aux=1; aux<=100; aux++) {
			    			 System.out.print("Informe o voto(Fulano=1,Ciclano=2,Beltrano=3) = ");
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
				    	    			 cont4++;
	 }
	 System.out.println("Fulano = " +cont1);
	 System.out.println("Ciclano = " +cont2);
	 System.out.println("Beltrano = " +cont3);
	 System.out.println("Nulo = " +cont4);
	 teclado.close();
	}

}
