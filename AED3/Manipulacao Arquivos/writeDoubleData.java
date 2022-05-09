import java.io.*;

public class writeDoubleData {

    public static void main(String[] args) throws IOException {

        // Declara vetor de double
        double[] data = {1.55555, 3.58, 6.788797, 1.3333, 2.8157};

        // Escreve valores no arquivo
        writeData(data, "file.txt");
    }

    public static void writeData(double[] data, String nome_arq) throws IOException {
        // Cria stream para escrita de dados tipados em arquivo
        FileOutputStream fout = new FileOutputStream(nome_arq);
        DataOutputStream out = new DataOutputStream(fout);
        out.writeInt(data.length);      // Escreve o tamanho do vetor
        for (int i = 0; i < data.length; i++)
            out.writeDouble(data[i]);   // Escreve cada valor
        out.close();                    // Fecha stream
    }
}

