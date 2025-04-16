package chapter_8_boundaries.usingCodeThatDoesNotYetExis;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceStub();

        //Later, replace with real one without changing other code
        // EmailService emailService = new RealEmailService();

        EmailSender emailSender = new EmailSender(emailService);
        emailSender.notifyUser();
    }
}
