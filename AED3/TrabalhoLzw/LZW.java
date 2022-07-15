// Grupo: Pedro Augusto, Cauã, João Renato Vaz, Gustavo e  Matheus

package TrabalhoLzw;

import java.io.*;
import java.util.*;

public class LZW{


    private static BufferedWriter escrever;

    private static BufferedWriter escreverDescomprimido;

    private static BufferedWriter escreverCabecalho;


    private BufferedReader ler;
    private BufferedReader lerOriginal;



    public LZW(File arquivoOriginal,File arquivoComprimido, File arquivoDescomprimido) throws IOException {
        lerOriginal = new BufferedReader(new InputStreamReader(new FileInputStream( arquivoOriginal)));
        escrever = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoComprimido)));
        escreverCabecalho = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoDescomprimido)));
        escreverDescomprimido = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivoDescomprimido)));

        String tipo = lerOriginal.readLine();
        String resolução = lerOriginal.readLine();
        String pigmentacao =  lerOriginal.readLine();

        escreverCabecalho.write(tipo + "\n" + resolução + "\n" + pigmentacao + "\n");

        System.out.println(tipo + " \n" + resolução + "\n" + pigmentacao);
        String texto;
        StringBuilder todoTexto = new StringBuilder();
        while ((texto = lerOriginal.readLine()) != null) todoTexto.append(texto);

        List<Integer> compress = comp(todoTexto.toString());
        decode(compress);

        escrever.close();
        lerOriginal.close();
        escreverDescomprimido.close();
        escreverCabecalho.close();

    }


    public static  String decode(List<Integer> encodeText) throws IOException {
        int dicSize = 256;
        Map<Integer, String> dicionario = new HashMap<>();
        for (int i = 0; i < dicSize; i++) {
            dicionario.put(i, String.valueOf((char) i));
        }
        String caracteres = String.valueOf((char) encodeText.remove(0).intValue());
        StringBuilder result = new StringBuilder(caracteres);
        for (int code : encodeText) {
            String entry = dicionario.containsKey(code)
                    ? dicionario.get(code)
                    : caracteres + caracteres.charAt(0);
            result.append(entry);
            dicionario.put(dicSize++, caracteres + entry.charAt(0));
            caracteres = entry;

        }
        escreverDescomprimido.write(String.valueOf(result));
        return result.toString();
    }

    public static List<Integer> comp(String text) throws IOException {

        int DicioarioTam = 256;
        Map<String, Integer> dicionario = new HashMap<>();
        for (int i = 0; i < DicioarioTam; i++) {
            dicionario.put(String.valueOf((char) i), i);
        }
        String p = "";
        List<Integer> result = new ArrayList<>();
        for (char c : text.toCharArray()) {
            String add = p + c;
            if (dicionario.containsKey(add)) {
                p = add;
            } else {
                result.add(dicionario.get(p));
                dicionario.put(add, DicioarioTam++);
                p = String.valueOf(c);
            }
        }
        if (!p.isEmpty()) {
            result.add(dicionario.get(p));
        }
        escrever.write(String.valueOf(result));
        return result;
    }

    public static void main(String[] args) throws IOException{
        File arquivoOriginal = new File("src/lena.txt");
        File arquivoCompactado = new File("src/teste.txt");
        File arquivoDescompactado = new File("src/testedescompactado.txt");

        LZW compressor = new LZW(arquivoOriginal,arquivoCompactado, arquivoDescompactado);
        
    }

}

