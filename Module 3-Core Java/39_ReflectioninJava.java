import java.lang.reflect.*;

public class ReflectionExample {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionExample");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Method method = cls.getMethod("greet", String.class);
        method.invoke(null, "World");
    }
}
