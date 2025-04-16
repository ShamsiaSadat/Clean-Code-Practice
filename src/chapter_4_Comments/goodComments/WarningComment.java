package chapter_4_Comments.goodComments;

public class WarningComment {

    public int divide(int a, int b) {
        // WARNING: division by zero will cause a crash!
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

}
