package chapter3.function.structured.programming;

public class Structured {
    public static void main(String[] args) {
        Structured app = new Structured();
        app.checkAge(20);
        app.printNumbers();
        app.calculateSum();
    }

    public void checkAge(int age) {
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }

    public void printNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public void calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
