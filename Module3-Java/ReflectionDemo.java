import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.lang.String");

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            System.out.println("Parameters: " + method.getParameterCount());
        }

        // Example invoking a method dynamically
        Method method = String.class.getMethod("toUpperCase");
        String result = (String) method.invoke("hello");
        System.out.println("Result of toUpperCase: " + result);
    }
}