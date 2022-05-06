import java.util.Scanner;
public class exe2c4 {
	public static void main(String[] args) {
		String nome, cpf, ci, tituloEleitor,carteiraMoto,empresa;
		Double salario;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Seu Nome: ");
		nome = teclado.nextLine();
		System.out.print("Seu CPF: ");
		cpf = teclado.nextLine();
		System.out.print("Seu C.I.: ");
		ci = teclado.nextLine();
		System.out.print("Seu Titulo de Eleitor: ");
		tituloEleitor = teclado.nextLine();
		System.out.print("Sua Carteira de Motorista: ");
		carteiraMoto = teclado.nextLine();
		System.out.print("Nome da Empresa: ");
		empresa = teclado.nextLine();
		System.out.print("Seu Salário: ");
		salario = teclado.nextDouble();
		System.out.println("FICHA FUNCIONAL DE: "+nome);
		System.out.println("Documentos:");
		System.out.println("CPF.............................."+cpf);
		System.out.println("C.I.............................."+ci);
		System.out.println("Titulo de eleitor................"+tituloEleitor);
		System.out.println("Carteira de Motorista............"+carteiraMoto);
		System.out.println("Empresa: "+empresa);
		System.out.println("Salário:R$"+salario);
		teclado.close();
	}

}
