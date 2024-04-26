import java.io.*;
public class FileRead {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("xyz.txt");
        int i=fr.read();
        while (i!=-1)
        {
            System.out.print((char) i);
            i=fr.read();
        }
        fr.close();
    }
}
