package chapter_1_CleanCode;

public class CleanCode {
    private static final int MAX_COUNT = 34;

    public static void main(String[] args) {
        printSumOfValidNumbers();
    }

    public static void printSumOfValidNumbers() {
        int total = 0;

        for( int i = 0; i < MAX_COUNT; i++) {
            if(isValid(i)) {
                total += i;
            }
        }
        System.out.println("Sum of valid numbers: " + total);
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 20;
    }
}
