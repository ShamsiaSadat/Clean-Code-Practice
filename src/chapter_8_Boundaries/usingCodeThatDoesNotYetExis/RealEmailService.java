package chapter_8_Boundaries.usingCodeThatDoesNotYetExis;

public class RealEmailService implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {

    }

    @Override
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending real email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
