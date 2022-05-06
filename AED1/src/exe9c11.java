import java.util.Scanner;

public class exe9c11 {

	public static void main(String[] args) {
		String nome,velho="",novo="";
		long rf, ano, codigo=0, ordem,anoV=14,anoN=10,ordemV=1000,ordemN=-1;
		int cont1=0,cont2=0,cont3=0,cont4=0,contA=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite fim no nome do funcionário");
		do {
			System.out.print("Informe o nome do funcionário: ");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("fim")) {
				System.out.print("Informe o RF (registro funcional): ");
				rf = teclado.nextLong();
				teclado.nextLine();
				ano=rf/10000;
				ordem=rf%1000;
				if(rf>144999||rf<101000) {
					System.out.println("REGISTRO INVÁLIDO");
					continue;
				}else {
				if (ano < 10 || ano > 14) {
					System.out.println("REGISTRO INVÁLIDO");
					continue;
				} else {
					codigo = rf / 1000 % 10;
					}if(codigo==1) {
						cont1++;
					}else
						if(codigo==2) {
							if(ano==10) {
								contA++;
							}
							cont2++;
						}else
							if(codigo==3) {
								cont3++;
							}else
								if(codigo==4) {
									cont4++;
									
								}else 
									System.out.println("REGISTRO INVÁLIDO");
					if(ordemV>ordem&&anoV>=ano) {
						velho=nome;
						ordemV=ordem;
						anoV=ano;
					}
					if(ordemN<ordem&&anoN<=ano) {
						novo=nome;
						ordemN=ordem;
						anoN=ano;
					}
			}
			}
		} while (!nome.equalsIgnoreCase("fim"));
		if(cont1>cont2) {
			if(cont1>cont3) {
				if(cont1>cont4) {
					System.out.println("Setor que tem mais funcionários = Gerência");
				}else
					System.out.println("Setor que tem mais funcionários = Obras");
			}else
				if(cont3>cont4) {
					System.out.println("Setor que tem mais funcionários = Pesquisa");
				}
		}else
			if(cont2>cont3&&cont2>cont4) {
				System.out.println("Setor que tem mais funcionários = Administração");
			}
		System.out.println("Funcionários no setor 1 = "+cont1);
		System.out.println("Funcionários no setor 2 = "+cont2);
		System.out.println("Funcionários no setor 3 = "+cont3);
		System.out.println("Funcionários no setor 4 = "+cont4);
		System.out.println("Funcionários que foram admitidos em 2010 e trabalham na Administração = "+contA);
		System.out.println("Funcionário mais antigo = "+velho);
		System.out.println("Funcionário mais novo = "+novo);
		teclado.close();
	}

}
