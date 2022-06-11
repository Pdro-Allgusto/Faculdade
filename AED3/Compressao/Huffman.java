package huffman.versaoziviani;

import java.io.*;

public class Huffman {

    private static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    private static final int baseNum = 128;
    private static final int m = 67001;
    private static final int maxTamPalavra = 35;

    private static void imprime(String msg) {
        System.out.print(msg);
    }

    public static void main(String[] args) throws Exception {
        imprime("Arquivo com os delimitadores em uma linha:");
        String nomeArqDelim = in.readLine();
        String opcao = "";
        do {
            imprime("**************************************\n");
            imprime("*               Opcoes               *\n");
            imprime("*------------------------------------*\n");
            imprime("* (c) Compressao                     *\n");
            imprime("* (d) Descompressao                  *\n");
            imprime("* (p) Pesquisa no texto comprimido   *\n");
            imprime("* (f) Termina                        *\n");
            imprime("**************************************\n");
            imprime("* Opcao:");
            opcao = in.readLine();
            if (opcao.toLowerCase().equals("c")) {
                imprime("Arquivo texto a ser comprimido:");
                String nomeArqTxt = in.readLine();
                imprime("Arquivo comprimido a ser gerado:");
                String nomeArqComp = in.readLine();
                HuffmanByte huff = new HuffmanByte(nomeArqDelim, baseNum,
                        m, maxTamPalavra);
                huff.compressao(nomeArqTxt, nomeArqComp);
            } else if (opcao.toLowerCase().equals("d")) {
                imprime("Arquivo comprimido a ser descomprimido:");
                String nomeArqComp = in.readLine();
                imprime("Arquivo texto a ser gerado:");
                String nomeArqTxt = in.readLine();
                HuffmanByte huff = new HuffmanByte(nomeArqDelim, baseNum,
                        m, maxTamPalavra);
                huff.descompressao(nomeArqTxt, nomeArqComp);
            } else if (opcao.toLowerCase().equals("p")) {
                imprime("Arquivo comprimido para ser pesquisado:");
                String nomeArqComp = in.readLine();
                HuffmanByte huff = new HuffmanByte(null, baseNum,
                        m, maxTamPalavra);
                huff.busca(nomeArqComp);
            }
        } while (!opcao.toLowerCase().equals("f"));
    }
}

