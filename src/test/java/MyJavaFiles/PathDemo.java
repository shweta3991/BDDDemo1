package MyJavaFiles;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws Exception{
        Path p= Paths.get("myFile.txt");
        System.out.println("Does file myFile.txt exists? " + Files.exists(p));
        System.out.println(" Whole path: " + p.toString());
        System.out.println("File name: " + p.getFileName());
        System.out.println(p.toAbsolutePath());
        System.out.println(p.getNameCount());
        System.out.println(p.getName(0));
        Files.createFile(p);
        System.out.println("After create File, does file myFIle.txt exists? " + Files.exists(p));
        System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));

        Path myDir= Paths.get("myDir");
        System.out.println("Does myDir exists? " + Files.exists(myDir));
        System.out.println(myDir.toString());
        System.out.println(myDir.getFileName());
        System.out.println(myDir.toAbsolutePath());
        System.out.println(myDir.getNameCount());
        System.out.println(myDir.getName(0));
        Files.createDirectory(myDir);
        System.out.println("After create Directory, does file myFIle.txt exists? " + Files.exists(myDir));
        System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}
