import java.util.Scanner;
public class exe11c8 {
	public static void main(String[] args) {
	String nome, sexo, civil, olhos, cabelos,nomeSalario = "";
	int idade, escolaridade,cont = 0;
	double salario, salarioMaior = 0, salarioMaiorH = 0,salarioMenorH = 0, diferencaH;
	Scanner teclado = new Scanner(System.in);
	for(int aux=1; aux<=50; aux++) {
		System.out.print("Informe o nome: ");
	    nome = teclado.nextLine();
	    teclado.next();
	    System.out.print("Informe a idade: ");
	    idade = teclado.nextInt();
	    System.out.print("Sexo (M ou F): ");
        sexo = teclado.nextLine();
        teclado.next();
        System.out.print("Estado civil (“C” para casado, “S” para solteiro ou “O” para outros): ");
        civil = teclado.nextLine();
        System.out.print("Cor dos olhos (“A” para azul, “C” para castanhos, “P” para preto ou “O” para outros): ");
	    olhos = teclado.nextLine();
	    System.out.print("Cor dos cabelos (“L” para loiro, “P” para preto, “C” para castanhos ou “R” para ruivos): ");
	    cabelos = teclado.nextLine();
	    System.out.print("Informe o salário (em R$): ");
	    salario = teclado.nextDouble();
	    System.out.print("Informe a escolaridade (1 para analfabeto, 2 para ensino fundamental, 3 para ensino médio ou 4 para superior): ");
	    escolaridade = teclado.nextInt();
	    if(aux==1 || salario>salarioMaior) {
			salarioMaior = salario;
			nomeSalario = nome;
		}
	    if (sexo.equalsIgnoreCase("f")) {
	    	if(idade>18 && idade<25) {
	    		if(salario>10000) {
	    			if(escolaridade == 4) {
	    				if(civil.equalsIgnoreCase("s")) {
	    					if(olhos.equalsIgnoreCase("a")) {
	    						if(cabelos.equalsIgnoreCase("l")) {
	    							cont++;
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
        }else
        	if(aux==1 || salario>salarioMaiorH) {
        		salarioMaiorH = salario;
        	}else
        		if(aux==1 || salario<salarioMenorH) {
        			salarioMenorH = salario;
        		} 	
	}
	diferencaH = salarioMaiorH-salarioMenorH;
	System.out.println("Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo = "+ cont);
	System.out.println("Nome da pessoa com maior salário = "+ nomeSalario);
	System.out.println("Diferença entre o maior e menor salário dos homens = "+ diferencaH);
	teclado.close();
	}

}
