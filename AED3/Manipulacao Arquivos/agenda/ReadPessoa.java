package agenda;

import java.io.*;

public class ReadPessoa {
    public static void main(String[] args) {
        try {
            // Cria stream para leitura de objetos
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("person.dat"));
            // Le tamanho e aloca vetor de objetos
            Pessoa[] vetor = new Pessoa[in.readInt()];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (Pessoa) in.readObject(); // Le cada objeto
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
} // fim readPessoa class
