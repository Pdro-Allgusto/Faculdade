import java.util.Scanner;

public class exe12c6 {
	public static void main(String[] args) {
	long bolas, mesesCopa, caixa, galpao;
	double galpaoPreco, custoFinal, caixaPapelao, restoCaixa, galpaoResto,precoGalpao,caixaPreco;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o custo total de uma produ��o");
	System.out.print("Coloque o n�mero de bolas produzidas com sucesso: ");
	bolas = teclado.nextLong();
	System.out.print("Coloque o n�mero de meses at� a copa: ");
	mesesCopa = teclado.nextLong();
	System.out.print("Coloque o pre�o do aluguel mensal do galp�o: ");
	galpaoPreco = teclado.nextDouble();
	System.out.print("Coloque o pre�o da caixa de papel�o: ");
	caixaPreco = teclado.nextDouble();
	if(bolas>10) {
		caixa = bolas/10;
		restoCaixa = bolas%10;
		if(restoCaixa>0) {
			caixa = caixa+1;
			caixaPapelao= caixa*caixaPreco;
			if(caixa<850) {
				galpao = 1;
			}else
				galpao=caixa/850;
				galpaoResto=caixa%850;
				if(galpaoResto>0) {
					galpao=galpao+1;
					precoGalpao=galpao*galpaoPreco*mesesCopa;
					custoFinal=caixaPapelao+precoGalpao;
					System.out.println("Pre�o embalagem: "+caixaPapelao+"\nPre�o galp�o"+precoGalpao+"\nCusto final"+custoFinal);
				}else
				    precoGalpao=galpao*galpaoPreco*mesesCopa;
				    custoFinal=caixaPapelao+precoGalpao;
				    System.out.println("Pre�o embalagem: "+caixaPapelao+"\nPre�o galp�o"+precoGalpao+"\nCusto final"+custoFinal);
    	}else
		    caixaPapelao= caixa*caixaPreco;
    			if(caixa<850) {
    				galpao = 1;
    			}else
    				galpao=caixa/850;
    				galpaoResto=caixa%850;
    				if(galpaoResto>0) {
    					galpao=galpao+1;
    					precoGalpao=galpao*galpaoPreco*mesesCopa;
    					custoFinal=caixaPapelao+precoGalpao;
    					System.out.println("Pre�o embalagem: "+caixaPapelao+"\nPre�o galp�o"+precoGalpao+"\nCusto final"+custoFinal);
    				}else
    				    precoGalpao=galpao*galpaoPreco*mesesCopa;
    				    custoFinal=caixaPapelao+precoGalpao;
    				    System.out.println("Pre�o embalagem: "+caixaPapelao+"\nPre�o galp�o"+precoGalpao+"\nCusto final"+custoFinal);
				
	}else
		if(bolas<10) {
			 caixaPapelao= caixaPreco;
		        precoGalpao=1*galpaoPreco*mesesCopa;
		        custoFinal=caixaPapelao+precoGalpao;
		        System.out.println("Pre�o embalagem: "+caixaPapelao+"\nPre�o galp�o"+precoGalpao+"\nCusto final"+custoFinal);
		}
	teclado.close();
	}

}
