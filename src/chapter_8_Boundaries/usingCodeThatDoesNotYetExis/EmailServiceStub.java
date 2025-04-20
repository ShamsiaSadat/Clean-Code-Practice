package chapter_8_Boundaries.usingCodeThatDoesNotYetExis;

public class EmailServiceStub implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("[Stub] Pretending to send email to " + to);
    }

    @Override
    public void sendMail(String to, String subject, String body) {

    }
}
