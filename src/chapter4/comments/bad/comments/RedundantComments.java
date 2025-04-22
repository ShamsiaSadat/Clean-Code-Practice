package chapter4.comments.bad.comments;

public class RedundantComments {

    public void redundantComment() {
        int x = 10;
        // Set x to 10 ← Redundant, adds no value
        System.out.println(x);
    }
}
