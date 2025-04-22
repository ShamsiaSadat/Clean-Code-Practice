package chapter4.comments.bad.comments;

public class CommentedOutCode {

    public void commentedOutCode() {
        // int x = 5;
        // x = x + 10;
        // System.out.println("Old logic: " + x); ← Remove old logic, use version control
        System.out.println("New logic: " + (5 + 10));
    }

}
