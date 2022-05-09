import java.io.*;

public class ContaLinhas {

    public static void main(String args[]) throws IOException {

        BufferedReader arq = new BufferedReader(new FileReader("file.txt"));
        String linha = arq.readLine();
        int contlinha = 0;
        int numchar = 0;
        while (linha != null) {
            contlinha++;
            numchar += linha.length();
            linha = arq.readLine();
        }
        System.out.println("num linhas = " + contlinha);
        System.out.println("num caracteres = " + numchar);
    }
}
