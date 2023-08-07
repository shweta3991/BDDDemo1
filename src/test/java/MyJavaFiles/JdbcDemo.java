package MyJavaFiles;

import java.lang.reflect.Method;

public class JdbcDemo {
    public static void main(String[] args) throws Exception{
        //Class.forName("java.lang.String");
        Class<?> aClass = Class.forName("java.lang.String");
        Object o = aClass.newInstance();
        System.out.println(aClass.getMethods());
        for (Method m: aClass.getMethods()){
            System.out.println(m.getName());
        }
        System.out.println(aClass.getName());
    }
}
