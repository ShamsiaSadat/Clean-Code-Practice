package chapter7.errorhandling;

public class ReturningErrorCodes {

    public int divide(int a, int b) {
        if (b == 0) return -1; // error code
        return a / b;
    }
}
