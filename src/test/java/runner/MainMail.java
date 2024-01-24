package runner;



public class MainMail {


    public static void main(String[] args) {

        GEmailsender gEmailSender = new GEmailsender();
        String to = "kanchan1794@gmail.com";
        String from = "kanchan1794@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }

}
