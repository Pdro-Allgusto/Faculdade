import java.util.Scanner;
public class exe17c6 {
	public static void main(String[] args) {
	String questao1, questao2, questao3, questao4, questao5, questao6, questao7, questao8, questao9;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Responda com V ou F");
	System.out.print("Voc� tem curso t�cnico de programa��o? ");
	questao1 = teclado.nextLine();
	System.out.print("Voc� tem curso superior de programa��o? ");
	questao2= teclado.nextLine();
	System.out.print("Voc� tem menos de 3 anos de experi�ncia em programa��o? ");
	questao3 = teclado.nextLine();
	System.out.print("Voc� se considera uma pessoa criativa? ");
	questao4 = teclado.nextLine();
	System.out.print("Voc� prefere liderar a ser liderado? ");
	questao5 = teclado.nextLine();
	System.out.print("Voc� prefere trabalhar sozinho a trabalhar em equipe? ");
	questao6 = teclado.nextLine();
	System.out.print("Voc� � autodidata (aprende sozinho)? ");
	questao7 = teclado.nextLine();
	System.out.print("Voc� aceitaria uma remunera��o inicial de R$1500? ");
	questao8 = teclado.nextLine();
	System.out.print("Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH? ");
	questao9 = teclado.nextLine();
	if (questao4.equalsIgnoreCase("v")) {
		if(questao6.equalsIgnoreCase("f")) {
			if(questao7.equalsIgnoreCase("v")) {
				if(questao9.equalsIgnoreCase("f")) {
					if(questao5.equalsIgnoreCase("f")) {
						if(questao3.equalsIgnoreCase("v")) {
							if(questao1.equalsIgnoreCase("v")) {
								System.out.println("Voc� � qualificado");
							}else
								if(questao2.equalsIgnoreCase("v")) {
									System.out.println("Voc� � qualificado");
								}else
									System.out.println("Voc� n�o � qualificado");
						}else
							System.out.println("Voc� n�o � qualificado");
					}else
						if (questao8.equalsIgnoreCase("v")){
							System.out.println("Voc� n�o � qualificado");
						}
				}else
					System.out.println("Voc� n�o � qualificado");
			}else
				System.out.println("Voc� n�o � qualificado");
		}else
			System.out.println("Voc� n�o � qualificado");
	}else
		System.out.println("Voc� n�o � qualificado");
	teclado.close();
	}

}
