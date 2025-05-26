// TypeCastingExample.java
public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit cast

        System.out.println("Original double: " + myDouble);
        System.out.println("After casting to int: " + myInt);

        int number = 42;
        double converted = number; // Implicit cast

        System.out.println("Original int: " + number);
        System.out.println("After casting to double: " + converted);
    }
}