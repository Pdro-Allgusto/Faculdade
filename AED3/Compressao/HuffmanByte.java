package huffman.versaoziviani;

import java.io.*;

public class HuffmanByte {

    private int baseNum;
    private int base[], offset[];
    private RandomAccessFile arqComp; // Arquivo comprimido
    private String nomeArqTxt, nomeArqDelim;
    private TabelaHash vocabulario;

    private static class Codigo {
        int codigo;
        int c; // Comprimento do código
    }

    public HuffmanByte(String nomeArqDelim, int baseNum, int m,
                       int maxTamChave) throws Exception {
        this.baseNum = baseNum;
        this.base = null;
        this.offset = null;
        this.nomeArqTxt = null;
        this.nomeArqDelim = nomeArqDelim;
        this.vocabulario = new TabelaHash(m, maxTamChave);
    }

    //  public ByteHuffman (int baseNum) { this.baseNum = baseNum; }
    private void calculaCompCodigo(ItemVoc[] A, int n) {
        int resto = 0;
        if (n > (this.baseNum - 1)) {
            resto = 1 + ((n - this.baseNum) % (this.baseNum - 1));
            if (resto < 2) resto = this.baseNum;
        } else resto = n - 1;
        // Número de nodos internos
        int noInt = 1 + ((n - resto) / (this.baseNum - 1));
        int freqn = ((Integer) A[n].recuperaChave()).intValue();
        for (int x = (n - 1); x >= (n - resto + 1); x--) {
            int freqx = ((Integer) A[x].recuperaChave()).intValue();
            freqn = freqn + freqx;
        }
        A[n].alteraChave(freqn);
        // Primeira Fase
        int raiz = n;
        int folha = n - resto;
        int prox;
        for (prox = n - 1; prox >= (n - noInt + 1); prox--) {
            // @{\it Procura Posi\c{c}\~ao}@
            int freqraiz = ((Integer) A[raiz].recuperaChave()).intValue();
            if ((folha < 1) || ((raiz > prox) &&
                    (freqraiz <= ((Integer) A[folha].recuperaChave()).intValue()))) {
                // @{\it N\'o interno}@
                A[prox].alteraChave(freqraiz);
                A[raiz].alteraChave(prox);
                raiz--;
            } else { // @{\it N\'o folha}@
                int freqfolha = ((Integer) A[folha].recuperaChave()).intValue();
                A[prox].alteraChave(freqfolha);
                folha--;
            }
            // @{\it Atualiza Freq\"u\^encias}@
            for (int x = 1; x <= (this.baseNum - 1); x++) {
                freqraiz = ((Integer) A[raiz].recuperaChave()).intValue();
                int freqprox = ((Integer) A[prox].recuperaChave()).intValue();
                if ((folha < 1) || ((raiz > prox) &&
                        (freqraiz <= ((Integer) A[folha].recuperaChave()).intValue()))) {
                    // @{\it N\'o interno}@
                    A[prox].alteraChave(freqprox + freqraiz);
                    A[raiz].alteraChave(prox);
                    raiz--;
                } else { // @{\it N\'o folha}@
                    int freqfolha = ((Integer) A[folha].recuperaChave()).intValue();
                    A[prox].alteraChave(freqprox + freqfolha);
                    folha--;
                }
            }
        }//@\lstcontinue@
        // @{\it Segunda Fase}@
        A[raiz].alteraChave(0);
        for (prox = raiz + 1; prox <= n; prox++) {
            int pai = ((Integer) A[prox].recuperaChave()).intValue();
            int profundidadepai = ((Integer) A[pai].recuperaChave()).intValue();
            A[prox].alteraChave(profundidadepai + 1);
        }
        // @{\it Terceira Fase}@
        int disp = 1;
        int u = 0;
        int h = 0;
        prox = 1;
        while (disp > 0) {
            while ((raiz <= n) &&
                    (((Integer) A[raiz].recuperaChave()).intValue() == h)) {
                u++;
                raiz++;
            }
            while (disp > u) {
                A[prox].alteraChave(h);
                prox++;
                disp--;
                if (prox > n) {
                    u = 0;
                    break;
                }
            }
            disp = this.baseNum * u;
            h = h + 1;
            u = 0;
        }
    }

    private void primeiraEtapa() throws Exception {
        ExtraiPalavra palavras = new ExtraiPalavra(nomeArqDelim, nomeArqTxt);
        String palavra = null;
        while ((palavra = palavras.proximaPalavra()) != null) {
            // O primeiro espaço depois da palavra não é codificado
            if (palavra.equals("")) continue;
            ItemVoc itemVoc = (ItemVoc) this.vocabulario.pesquisa(palavra);
            if (itemVoc != null) { // Incrementa frequência
                int freq = ((Integer) itemVoc.recuperaChave()).intValue();
                itemVoc.alteraChave(freq + 1);
            } else { // Insere palavra com frequência 1
                itemVoc = new ItemVoc(palavra, 1, 0);
                this.vocabulario.insere(palavra, itemVoc);
            }
        }
        palavras.fecharArquivos();
    }

    private ItemVoc[] ordenaPorFrequencia() {
        Object aux[] = this.vocabulario.recuperaItens();
        ItemVoc A[] = new ItemVoc[aux.length + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        for (int i = 0; i < aux.length; i++) A[i + 1] = (ItemVoc) aux[i];
        Ordenacao.quicksort(A, aux.length);
        return A;
    }

    private int constroiVetores(ItemVoc A[], int n) throws Exception {
        int maxCompCod = ((Integer) A[n].recuperaChave()).intValue();
        int wcs[] = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        this.offset = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        this.base = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        for (int i = 1; i <= maxCompCod; i++) wcs[i] = 0;
        for (int i = 1; i <= n; i++) {
            int freq = ((Integer) A[i].recuperaChave()).intValue();
            wcs[freq]++;
            this.offset[freq] = i - wcs[freq] + 1;
        }
        this.base[1] = 0;
        for (int i = 2; i <= maxCompCod; i++) {
            this.base[i] = this.baseNum * (this.base[i - 1] + wcs[i - 1]);
            if (this.offset[i] == 0) this.offset[i] = this.offset[i - 1];
        }
        // @{\it Salvando as tabelas em disco}@
        this.arqComp.writeInt(maxCompCod);
        for (int i = 1; i <= maxCompCod; i++) {
            this.arqComp.writeInt(this.base[i]);
            this.arqComp.writeInt(this.offset[i]);
        }
        return maxCompCod;
    }

    private int segundaEtapa() throws Exception {
        ItemVoc A[] = this.ordenaPorFrequencia();
        int n = A.length - 1;
        this.calculaCompCodigo(A, n);
        int maxCompCod = this.constroiVetores(A, n);
        // @{\it Grava Vocabulario}@
        this.arqComp.writeInt(n);
        for (int i = 1; i <= n; i++) {
            this.arqComp.writeChars(A[i].palavra());
            this.arqComp.writeChar('\0');
            A[i].alteraOrdem(i);
        }
        return maxCompCod;
    }

    private Codigo codifica(int ordem, int maxCompCod) {
        Codigo cod = new Codigo();
        cod.c = 1;
        while ((cod.c + 1 <= maxCompCod) && (ordem >= this.offset[cod.c + 1]))
            cod.c++;
        cod.codigo = ordem - this.offset[cod.c] + this.base[cod.c];
        return cod;
    }

    private void escreve(Codigo cod, int maxCompCod) throws Exception {
        int saida[] = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        int logBase2 = (int) (Math.log(this.baseNum) / Math.log(2));
        int mask = (int) Math.pow(2, logBase2) - 1;
        int i = 1;
        int cTmp = cod.c;
        saida[i] = cod.codigo >> (logBase2 * (cod.c - 1));
        if (logBase2 == 7) saida[i] = saida[i] | 128; // @{\it Marca\c{c}\~ao}@
        i++;
        cod.c--;
        while (cod.c > 0) {
            saida[i] = (cod.codigo >> (logBase2 * (cod.c - 1))) & mask;
            i++;
            cod.c--;
        }
        for (i = 1; i <= cTmp; i++) this.arqComp.writeByte(saida[i]);
    }

    private void terceiraEtapa(int maxCompCod) throws Exception {
        ExtraiPalavra palavras = new ExtraiPalavra(nomeArqDelim, nomeArqTxt);
        String palavra = null;
        while ((palavra = palavras.proximaPalavra()) != null) {
            // @{\it O primeiro espa\c{c}o depois da palavra n\~ao \'e codificado}@
            if (palavra.equals("")) continue;
            ItemVoc itemVoc = (ItemVoc) this.vocabulario.pesquisa(palavra);
            int ordem = itemVoc.recuperaOrdem();
            Codigo cod = this.codifica(ordem, maxCompCod);
            this.escreve(cod, maxCompCod);
        }
        palavras.fecharArquivos();
    }

    public void compressao(String nomeArqTxt, String nomeArqComp) throws Exception {
        this.nomeArqTxt = nomeArqTxt;
        this.arqComp = new RandomAccessFile(nomeArqComp, "rws");
        this.primeiraEtapa();
        int maxCompCod = this.segundaEtapa();
        this.terceiraEtapa(maxCompCod);
        this.arqComp.close();
    }

    // @{\it M\'etodos para descompress\~ao}@
    private int leVetores() throws Exception {
        int maxCompCod = this.arqComp.readInt();
        this.offset = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        this.base = new int[maxCompCod + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        for (int i = 1; i <= maxCompCod; i++) {
            this.base[i] = this.arqComp.readInt();
            this.offset[i] = this.arqComp.readInt();
        }
        return maxCompCod;
    }

    private String[] leVocabulario() throws Exception {
        int n = this.arqComp.readInt();
        String vocabulario[] = new String[n + 1]; // @{\it Ignora a posi\c{c}\~ao 0}@
        for (int i = 1; i <= n; i++) {
            vocabulario[i] = "";
            char ch;
            while ((ch = this.arqComp.readChar()) != '\0') {
                vocabulario[i] += ch;
            }
        }
        return vocabulario;
    }

    private int decodifica(int maxCompCod) throws Exception {
        int logBase2 = (int) (Math.log(this.baseNum) / Math.log(2));
        int c = 1;
        int codigo = this.arqComp.read();
        if (codigo < 0) return codigo; // @{\it Fim de arquivo}@
        if (logBase2 == 7) codigo = codigo - 128; // @ {\it Remove o bit de marcacao}@
        while (((c + 1) <= maxCompCod) && ((codigo << logBase2) >= this.base[c + 1])) {
            int codigoTmp = this.arqComp.read();
            codigo = (codigo << logBase2) | codigoTmp;
            c++;
        }
        return (codigo - this.base[c] + this.offset[c]);
    }

    private boolean eDelimitador(String delim, char ch) {
        return (delim.indexOf(ch) >= 0);
    }

    public void descompressao(String nomeArqTxt, String nomeArqComp) throws Exception {
        this.nomeArqTxt = nomeArqTxt;
        this.arqComp = new RandomAccessFile(nomeArqComp, "rws");
        BufferedReader arqDelim = new BufferedReader(new FileReader(this.nomeArqDelim));
        BufferedWriter arqTxt = new BufferedWriter(new FileWriter(this.nomeArqTxt));
        String delim = arqDelim.readLine() + "\r\n";
        int maxCompCod = this.leVetores();
        String vocabulario[] = this.leVocabulario();
        int ind = 0;
        String palavraAnt = " ";
        while ((ind = this.decodifica(maxCompCod)) >= 0) {
            if (!eDelimitador(delim, palavraAnt.charAt(0)) &&
                    !eDelimitador(delim, vocabulario[ind].charAt(0)))
                arqTxt.write(" ");
            arqTxt.write(vocabulario[ind]);
            palavraAnt = vocabulario[ind];
        }
        arqTxt.close();
    }

    private String atribui(Codigo cod) {
        String P = "";
        P += (char) ((cod.codigo >> (7 * (cod.c - 1))) | 128);
        cod.c--;
        while (cod.c > 0) {
            P += (char) ((cod.codigo >> (7 * (cod.c - 1))) & 127);
            cod.c--;
        }
        return P;
    }

    public void busca(String nomeArqComp) throws Exception {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        this.arqComp = new RandomAccessFile(nomeArqComp, "rws");
        int maxCompCod = this.leVetores();
        String vocabulario[] = this.leVocabulario();
        int codigo;
        String T = "";
        String P = "";
        while ((codigo = this.arqComp.read()) >= 0) T += (char) codigo;
        while (true) {
            System.out.print("Padrao (ou s para sair):");
            P = in.readLine();
            if (P.equals("s")) break;
            int ord = 1;
            for (ord = 1; ord < vocabulario.length; ord++)
                if (vocabulario[ord].equals(P)) break;
            if (ord == vocabulario.length) {
                System.out.println("Padrao:" + P + " nao encontrado");
                continue;
            }
            Codigo cod = this.codifica(ord, maxCompCod);
            String Padrao = this.atribui(cod);
            CasamentoExato.bmh(T, T.length(), Padrao, Padrao.length());
        }
    }
}
