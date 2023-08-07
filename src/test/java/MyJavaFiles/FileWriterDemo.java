package MyJavaFiles;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception{
        FileWriter fw= new FileWriter("MyFile.txt");
        fw.write(97);
        fw.write("\n");
        fw.write("Trying hard to understand filewritter class");
        fw.write("\n");
        fw.write(new char[]{'S','H','W','E','T','A'});
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
