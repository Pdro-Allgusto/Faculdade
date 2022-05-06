import java.util.Scanner;

public class exe5c11 {

	public static void main(String[] args) {
	int codigo,contI=0,cont=0,valor=0;
	double media;
	String nome;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Para finalizar digite fim no nome do aluno");
	do {
		System.out.print("Informe o nome do aluno: ");
		nome = teclado.nextLine();
		if (!nome.equalsIgnoreCase("fim")) {
			System.out.print("Informe o Código da Opção: ");
			codigo = teclado.nextInt();
			teclado.nextLine();
			cont++;
			if(codigo==1) {
				System.out.println("Aluno = "+nome+" Mensalidade = R$100,00");
				contI++;
				valor+=100;
			}else
				if(codigo==2) {
					System.out.println("Aluno = "+nome+" Mensalidade = R$150,00");
					valor+=150;
				}else
					if(codigo==3){
						System.out.println("Aluno = "+nome+" Mensalidade = R$120,00");
						valor+=120;
				}else
					System.out.println("Código Incorreto");
		}
	} while (!nome.equalsIgnoreCase("fim"));
	media =(float) valor/cont;
	System.out.println("A quantidade de alunos matriculados nas turmas de Inglês = "+contI);
	System.out.println("A mensalidade média da escola = "+media);
	teclado.close();
	}

}
