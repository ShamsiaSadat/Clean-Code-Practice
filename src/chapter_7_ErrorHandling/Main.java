package chapter_7_ErrorHandling;

public class Main {
    public static void main(String[] args) {
        new DivideWithErrorCode().run();
        new DivideWithException().run("abc");
        new DivideWithException().run("abc");
        new UserFinder().run();
        new OptionalExample().run();
        new BankTransfer().run();
    }
}
