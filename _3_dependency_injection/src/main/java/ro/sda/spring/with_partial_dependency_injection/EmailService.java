package ro.sda.spring.with_partial_dependency_injection;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        //logic to send mail
        System.out.println("Email sent to " + receiver + " with massage " + message);
    }
}
