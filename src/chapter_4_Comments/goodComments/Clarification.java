package chapter_4_Comments.goodComments;

public class Clarification {

    //Clarification - provides clarity for edge cases
    public String getUserType(int age) {
        // Edge case: under 0 age is treated as invalid
        if (age < 0) return "Invalid Age";
        if (age < 13) return "Child";
        else if (age <= 19) return "Teen";
        return "Adult";
    }

}
