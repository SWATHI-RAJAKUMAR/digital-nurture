// OperatorPrecedence.java
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        int resultWithBrackets = (10 + 5) * 2;

        System.out.println("Without brackets: " + result); // 10 + (5*2) = 20
        System.out.println("With brackets: " + resultWithBrackets); // (10+5)*2 = 30
    }
}