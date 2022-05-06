package Ordenacao;

public class LBSTree_Main {

    private static LBSTree Tree=new LBSTree();

    public static void main(String[] args) {

        String[] vetorNumeors=new String[]{"33","41","38","15","47","34","49","43"};

        for (int i=0;i<8;i++) {
            Tree.inserir(vetorNumeors[i]);
        }
        //

        System.out.println("Tamanho da árvore: "+Tree.tamanho());

        System.out.println("Conteudo da árvore: "+Tree.toString());

        System.out.println("Caminhamento pre-order da árvore: "+Tree.caminhar(Tree.PREORDER));

        System.out.println("Caminhamento in-order da árvore: "+Tree.caminhar(Tree.INODER));

        System.out.println("Caminhamento post-order da árvore: "+Tree.caminhar(Tree.POSTORDER));

        /*System.out.println("Item 4 está na árvore? "+ Tree.buscar("4"));

        System.out.println("Raiz da árvore: "+Tree.raiz);

        //System.out.println("Altura da árvore: "+Tree.altura()); criar altura

        System.out.println("Caminhamento pre-order da árvore: "+Tree.caminhar(Tree.PREORDER));

        //criar consultar raiz

        //Tree.retirar(Tree.raiz);

        //
        System.out.println("Caminhamento pre-order da árvore: "+Tree.caminhar(Tree.PREORDER));

        //System.out.println("Altura da árvore: "+Tree.altura()); criar altura

        Tree.retirar("0");
        Tree.retirar("6");
        Tree.retirar("3");

        //System.out.println("Altura da árvore: "+Tree.altura()); criar altura*/

    }
}
