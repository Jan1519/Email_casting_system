package reply;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;

public class ReplyEmailSEEN {
    final String emailSMTPserver = "smtp.gmail.com";
    final String emailSMTPPort = "587";
    final String mailStoreType = "pop3s"; 
    public void reply(String replyText, String emailNo, final String username,final String password) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", emailSMTPserver);
        properties.put("mail.smtp.port", emailSMTPPort);

        try {
//            Authenticator auth = new SMTPAuthenticator();
//            Session session = Session.getInstance(props, auth);
            Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

            Store mailStore = session.getStore(mailStoreType);
            mailStore.connect(emailSMTPserver, username, password);

            Folder folder = mailStore.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);

            Message[] messages = folder.getMessages();
            System.out.println("Total Message - " + messages.length);

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < messages.length; i++) {
                Message emailMessage = messages[i];
                System.out.println();
                System.out.println("Email " + (i + 1) + " -");
                System.out.println("Subject - " + emailMessage.getSubject());
                System.out.println("From - " + emailMessage.getFrom()[0]);
            }
            Message emailMessage
                    = folder.getMessage(Integer.parseInt(emailNo));

            
            String from = InternetAddress.toString(emailMessage.getFrom());
            String to = InternetAddress.toString(emailMessage.getRecipients(Message.RecipientType.TO));
            Message mimeMessage = new MimeMessage(session);
            mimeMessage = (MimeMessage) emailMessage.reply(false);
            mimeMessage.setFrom(new InternetAddress(username));
            mimeMessage.setText(replyText);
            mimeMessage.setSubject("RE: " + emailMessage.getSubject());
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.setReplyTo(emailMessage.getReplyTo());
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            Transport.send(mimeMessage);
            System.out.println("Email message forwarded successfully.");

            folder.close(false);
            mailStore.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error in forwarding email.");
        }
    }
    public static void main(String[] args) {
    }
}
