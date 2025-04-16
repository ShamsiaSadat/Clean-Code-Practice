package chapter_8_boundaries.usingCodeThatDoesNotYetExis;

public interface EmailService {
    void sendEmail(String to, String subject, String body);

    void sendMail(String to, String subject, String body);
}
