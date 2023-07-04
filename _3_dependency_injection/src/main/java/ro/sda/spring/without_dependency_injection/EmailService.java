package ro.sda.spring.without_dependency_injection;

/**
 * EmailService class that holds the logic to send email messages to recipient mail addresses
 */

public class EmailService {

    public void sendEmail(String massage, String receiver) {
        //logic to  send email
        System.out.println("Email sent to " + receiver + " with massage: " + massage);
    }

}
