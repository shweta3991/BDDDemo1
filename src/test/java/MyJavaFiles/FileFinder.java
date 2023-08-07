package MyJavaFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FileFinder extends SimpleFileVisitor<Path> {
    private PathMatcher matcher;
    ArrayList<Path> matchList = new ArrayList();

    public FileFinder(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob: " + pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path name = file.getFileName();
        System.out.println("Examining file: " + name);
        if (matcher.matches(name)){
            System.out.println();
            matchList.add(name);
        }
        return FileVisitResult.CONTINUE;
    }
}

class PathMatcherDemo1{
    public static void main(String[] args) throws IOException{
        Path path= Paths.get("myDir");
        //FileFinder finder= new FileFinder("file3.txt");
        FileFinder finder= new FileFinder("from.txt");
        Files.walkFileTree(path, finder);
        ArrayList<Path> matchList= finder.matchList;
        System.out.println(matchList);
        if (matchList.size()>0){
            for (Path p:matchList){
                System.out.println(p.getFileName());
            }
        }else {
            System.out.println("No files found");
        }
    }

}
