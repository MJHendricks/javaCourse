import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClass {

    public static void main (String[] args) {

        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("File located");
            fileRead(file);
        }
        else {
            System.out.println("File not found");
            fileWrite();
        }

    }
    static void fileRead(File file) {
        try  {
            FileReader fr = new FileReader("secret_message.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.print((char)data);
                data = fr.read();
            }
            fr.close();
        }
        catch (Exception E) {
            System.out.println("Could not read file.");
        }

        file.delete();
    }
    static void fileWrite() {
        try {
            FileWriter fw = new FileWriter("secret_message.txt");
            fw.write("roses \n ghost");
            fw.append(".");
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Could not write to file");
        }
    }

}
