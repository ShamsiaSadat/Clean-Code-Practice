package chapter5.formatting.indentation.matters;

public class GoodExample {
    public static void main(String[] args) {
        int score = 85;

        if (score > 50) {
            if (score > 80) {
                System.out.println("Excellent!");
            } else {
                System.out.println("Good Job!");
            }
        } else {
            System.out.println("Try again!");
        }
    }
}


