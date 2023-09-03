package kprostaklassa;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Chanel> chanelClass=Chanel.class;

         String name = chanelClass.getName();
        Method[]methods = chanelClass.getMethods();
        for (Method method: methods){
            System.out.println(method.getName());
            if ("getNumber".equals(method.getName()));
            System.out.println("tak mam taka metode ");
        }

        System.out.println(name);
    }
}
