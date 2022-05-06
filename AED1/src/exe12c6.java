import java.util.Scanner;

public class exe12c6 {
	public static void main(String[] args) {
	long bolas, mesesCopa, caixa, galpao;
	double galpaoPreco, custoFinal, caixaPapelao, restoCaixa, galpaoResto,precoGalpao,caixaPreco;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular o custo total de uma produção");
	System.out.print("Coloque o número de bolas produzidas com sucesso: ");
	bolas = teclado.nextLong();
	System.out.print("Coloque o número de meses até a copa: ");
	mesesCopa = teclado.nextLong();
	System.out.print("Coloque o preço do aluguel mensal do galpão: ");
	galpaoPreco = teclado.nextDouble();
	System.out.print("Coloque o preço da caixa de papelão: ");
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
					System.out.println("Preço embalagem: "+caixaPapelao+"\nPreço galpão"+precoGalpao+"\nCusto final"+custoFinal);
				}else
				    precoGalpao=galpao*galpaoPreco*mesesCopa;
				    custoFinal=caixaPapelao+precoGalpao;
				    System.out.println("Preço embalagem: "+caixaPapelao+"\nPreço galpão"+precoGalpao+"\nCusto final"+custoFinal);
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
    					System.out.println("Preço embalagem: "+caixaPapelao+"\nPreço galpão"+precoGalpao+"\nCusto final"+custoFinal);
    				}else
    				    precoGalpao=galpao*galpaoPreco*mesesCopa;
    				    custoFinal=caixaPapelao+precoGalpao;
    				    System.out.println("Preço embalagem: "+caixaPapelao+"\nPreço galpão"+precoGalpao+"\nCusto final"+custoFinal);
				
	}else
		if(bolas<10) {
			 caixaPapelao= caixaPreco;
		        precoGalpao=1*galpaoPreco*mesesCopa;
		        custoFinal=caixaPapelao+precoGalpao;
		        System.out.println("Preço embalagem: "+caixaPapelao+"\nPreço galpão"+precoGalpao+"\nCusto final"+custoFinal);
		}
	teclado.close();
	}

}
