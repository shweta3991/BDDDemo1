package MyJavaFiles;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File f1= new File("abc.txt");
        System.out.println("Does file abc.txt exists?" + f1.exists());
        f1.createNewFile();

        File dir= new File("C:\\Milan");
        dir.mkdir();
        System.out.println(dir.exists());

        File fMilan = new File(dir,"lib.txt");
        fMilan.createNewFile();

        System.out.println("Does file abc.txt exists?"+ f1.exists());
        File f2= new File("C:\\Program Files\\Internet Explorer");
        String [] list= f2.list();
        int count=0;
        for(String fileName: list){
            count++;
            System.out.println(fileName);
        }
        System.out.println("Total no of directories and files: " + count);
        int fileCount = 0;
        for (String s: list){
            File f3= new File(f2,s);
            if (f3.isFile())
                fileCount++;
        }
        System.out.println("Total number of file count " + fileCount);
    }
}
