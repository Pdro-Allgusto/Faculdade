package agenda;

import java.io.*;

public class ReadPessoaTel {
    public static void main(String[] args) {
        try {
            // Cria stream para leitura dos objetos
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("persontel.dat"));
            // Le tamanho e aloca vetor de objetos
            PessoaComTelefone[] vetor = new PessoaComTelefone[in.readInt()];
            // Le cada objeto da classe PessoaComTelefone bem como os objetos
            // da classe Telefone associados a cada um deles

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (PessoaComTelefone) in.readObject();
            }
            in.close(); // Fecha stream

            System.out.println("\nLista de Pessoas :");
            System.out.println("------------------");
            for (Pessoa pessoa : vetor)
                System.out.println(pessoa);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    } // fim main ( )
} // fim readPessoaTel class
