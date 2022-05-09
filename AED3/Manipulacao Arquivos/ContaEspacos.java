import java.io.*;

public class ContaEspacos {

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("file.txt");

        int total = 0, space = 0, value;

        while ((value = in.read()) != -1) {
            System.out.printf("%d:%s\n", value, (char)value);
            total++;
            if (Character.isWhitespace((char) value))
                space++;
        }
        in.close();
        System.out.printf("\ntotal caracteres: %d", total);
        System.out.printf("\ntotal whitechars: %d \n", space);
    }
}
