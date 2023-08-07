package MyJavaFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception{
        File f= new File("myFile.txt");
        Reader w= new FileReader(f);
        BufferedReader br = new BufferedReader(w);
        String line= br.readLine();
        while (line!= null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
