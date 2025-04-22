package chapter3.function.structured.programming;

public class Unstructured {
    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("Adult");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        // now another task
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
