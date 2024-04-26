import java.io.*;
public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("xyz.txt");
        fw.write("35");
        fw.write("\n");
        fw.write("me gira huva banda jama nichh baliye");
        char[] ch={'a','b','c','d'};
        fw.write("\n");
        fw.write(ch);
        System.out.println("Write sucessfully");
        fw.close();

    }
}
