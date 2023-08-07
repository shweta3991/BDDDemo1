package MyJavaFiles;

import java.io.PrintWriter;

public class PrintWritterDemo {
    public static void main(String[] args) throws Exception{
        PrintWriter pw= new PrintWriter("myFile.txt");
        pw.write(99);
        pw.println(99);
        pw.println(true);
        pw.println("Shweta");
        pw.flush();
        pw.close();
    }
}
