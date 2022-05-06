import java.util.Scanner;

public class exe5c13 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double angulo,sin,cos,tan,aSin,aCos,aTan;
	System.out.print("Informe um ângulo: ");
	angulo = teclado.nextInt();
	sin=Math.sin(angulo);
	cos=Math.cos(angulo);
	tan=Math.tan(angulo);
	aSin=Math.asin(angulo);
	aCos=Math.acos(angulo);
	aTan=Math.atan(angulo);
	System.out.println("Seno = "+sin);
	System.out.println("Cosseno = "+cos);
	System.out.println("Tangente = "+tan);
	System.out.println("Arco seno = "+aSin);
	System.out.println("Arco cosseno = "+aCos);
	System.out.println("Arco tangente = "+aTan);
	teclado.close();
	}

}
