import java.util.Scanner;
public class exe17c6 {
	public static void main(String[] args) {
	String questao1, questao2, questao3, questao4, questao5, questao6, questao7, questao8, questao9;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Responda com V ou F");
	System.out.print("Você tem curso técnico de programação? ");
	questao1 = teclado.nextLine();
	System.out.print("Você tem curso superior de programação? ");
	questao2= teclado.nextLine();
	System.out.print("Você tem menos de 3 anos de experiência em programação? ");
	questao3 = teclado.nextLine();
	System.out.print("Você se considera uma pessoa criativa? ");
	questao4 = teclado.nextLine();
	System.out.print("Você prefere liderar a ser liderado? ");
	questao5 = teclado.nextLine();
	System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
	questao6 = teclado.nextLine();
	System.out.print("Você é autodidata (aprende sozinho)? ");
	questao7 = teclado.nextLine();
	System.out.print("Você aceitaria uma remuneração inicial de R$1500? ");
	questao8 = teclado.nextLine();
	System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
	questao9 = teclado.nextLine();
	if (questao4.equalsIgnoreCase("v")) {
		if(questao6.equalsIgnoreCase("f")) {
			if(questao7.equalsIgnoreCase("v")) {
				if(questao9.equalsIgnoreCase("f")) {
					if(questao5.equalsIgnoreCase("f")) {
						if(questao3.equalsIgnoreCase("v")) {
							if(questao1.equalsIgnoreCase("v")) {
								System.out.println("Você é qualificado");
							}else
								if(questao2.equalsIgnoreCase("v")) {
									System.out.println("Você é qualificado");
								}else
									System.out.println("Você não é qualificado");
						}else
							System.out.println("Você não é qualificado");
					}else
						if (questao8.equalsIgnoreCase("v")){
							System.out.println("Você não é qualificado");
						}
				}else
					System.out.println("Você não é qualificado");
			}else
				System.out.println("Você não é qualificado");
		}else
			System.out.println("Você não é qualificado");
	}else
		System.out.println("Você não é qualificado");
	teclado.close();
	}

}
