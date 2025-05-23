package chapter8.boundaries.using.code.that.doesnot.exist.yet;

public class EmailSender {
    private final EmailService emailService;

    public EmailSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser() {
        emailService.sendEmail("user@example.com", "Welcome!", "Thanks for joining our app.");
    }
}
