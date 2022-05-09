import java.io.*;

public class readDoubleData {

    public static void main(String[] args) throws IOException {

        // Declara vetor auxiliar para simples conferência
        double[] aux;

        // Lê valores escritos no arquivo em um novo vetor
        aux = readData("file.txt");

        // Imprime o vetor auxiliar para simples conferência
        for (double valor : aux)
            System.out.printf("%.2f\n", valor);
    }

    public static double[] readData(String nome_arq) throws IOException {

        // Cria stream para leitura de dados tipados de arquivo
        FileInputStream fin = new FileInputStream(nome_arq);
        DataInputStream in = new DataInputStream(fin);

        // Lê o tamanho e aloca o vetor
        double[] data = new double[in.readInt()];

        for (int i = 0; i < data.length; i++)
            data[i] = in.readDouble();      // Lê cada valor
        in.close();                         // Fecha stream

        return data;
    }
}
