import java.util.Scanner;

public class exe8c11 {

	public static void main(String[] args) {
	String nome,funcao,nomeM="",funcaoM="";
	double valor,dinheiro,media,salario=0,total=0;
	long hora,horaM=0;
	int cont=0,cont1=0,cont5=0,cont10=0;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Para finalizar digite fim no nome do trabalhador");
	System.out.print("Informe o valor da hora trabalhada: ");
	valor = teclado.nextDouble();
	teclado.nextLine();
	do {
		System.out.print("Informe o nome do trabalhador: ");
		nome = teclado.nextLine();
		if (!nome.equalsIgnoreCase("fim")) {
			System.out.print("Informe a função: ");
			funcao = teclado.nextLine();
			System.out.print("Informe a quantidade de horas trabalhadas: ");
			hora = teclado.nextLong();
			teclado.nextLine();
			if(hora<100) {
				dinheiro=valor*hora+1000;
				System.out.println("Valor a receber = R$"+dinheiro);
				cont1++;
			}else
				if(hora<500) {
					dinheiro=valor*hora*10;
					System.out.println("Valor a receber = R$"+dinheiro);
					cont5++;
				}else {
					dinheiro=valor*hora*100/10;
					System.out.println("Valor a receber = R$"+dinheiro);
					cont10++;
				}
			if(cont==0||salario<dinheiro) {
				salario=dinheiro;
				nomeM=nome;
				funcaoM=funcao;
			}
			cont++;
			horaM+=hora;
			total+=salario;
		}
	} while (!nome.equalsIgnoreCase("fim"));
	media=horaM/cont;
	System.out.println("Média de horas trabalhadas por pessoa no projeto = "+media);
	System.out.println("Pessoa que receber o maior salário nome = "+nomeM+" função = "+funcaoM);
	System.out.println("A quantidade de pessoas por faixa do prêmio de produtividade: Até 100 = "+cont1+" Acima de 100 até 500 = "+cont5+" Acima de 500 = "+cont10);
	System.out.println("O valor total da folha de pagamento = "+total);

	teclado.close();
	}

}
