package MyJavaFiles;

import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardWatchEventKinds.*;

public class PathMatcherDemo {
    public static void main(String[] args) throws Exception{
        Map<WatchKey, Path> keyMap= new HashMap<>();
        try (WatchService service= FileSystems.getDefault().newWatchService()){
            Path path= Paths.get("myDir");
            keyMap.put(path.register(service, ENTRY_CREATE, ENTRY_DELETE,
                    ENTRY_MODIFY),path );

            WatchKey watchKey;
            do {
                watchKey= service.take();
                Path eventDir= keyMap.get(watchKey);
                for (WatchEvent<?> event:watchKey.pollEvents()){
                    WatchEvent.Kind<?> kind= event.kind();
                    Path eventPath= (Path)event.context();
                    System.out.println(eventDir + ": " + eventPath);
                }
            }
            while (watchKey.reset());
        }
        catch (Exception e){

        }
    }
}
