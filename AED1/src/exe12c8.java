import java.util.Scanner;
public class exe12c8 {
	public static void main(String[] args) {
	int cont1 = 0 , cont2 = 0,cont3 = 0, cont4 = 0, cont5 = 0, codigo;
	double soma1, soma2, soma3, soma4, soma5, total;
	Scanner teclado = new Scanner(System.in);
	for(int aux=1; aux<=1000; aux++) {
		System.out.print("Informe o código do produto: ");
	    codigo = teclado.nextInt();
	    if(codigo==1) {
	    	cont1++;
	    }else
	    	if(codigo==2) {
		    	cont2++;
		    }else
		    	if(codigo==3) {
			    	cont3++;
			    }else
			    	if(codigo==4) {
				    	cont4++;
				    }else
				    	cont5++;
	}
	soma1=cont1*1565;
	soma2=cont2*1890;
	soma3=cont3*2150;
	soma4=cont4*2963;
	soma5=cont5*3750;
	total=soma1+soma2+soma3+soma4+soma5;
	System.out.println("Custo total = "+ total);
	teclado.close();
	}

}
