package chapter_7_ErrorHandling;

public class DivideWithErrorCode {

    public int divide(int a, int b) {
        if (b == 0) return -1;  // Error code
        return a / b;
    }
    public void run() {
        int result = divide(10, 0);
        if (result == -1) {
            System.out.println("Division failed");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
