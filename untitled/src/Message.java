import java.util.Date;

public class Message {

    private Employee recipient; 
    private Employee sender; 
    private Date timestamp; 
    private String content; 


    public Message(Employee recipient, Employee sender, Date timestamp, String content) {
        if (recipient == null) {
            throw new IllegalArgumentException("Recipient can't be null.");
        }
        if (sender == null) {
            throw new IllegalArgumentException("Sender can't be null.");
        }
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp can't be null.");
        }
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content can't be empty.");
        }
        this.recipient = recipient;
        this.sender = sender;
        this.timestamp = timestamp;
        this.content = content;
    }

 
    public Employee getRecipient() {
        return recipient;
    }

    public void setRecipient(Employee recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Recipient can't be null.");
        }
        this.recipient = recipient;
    }

    public Employee getSender() {
        return sender;
    }

    public void setSender(Employee sender) {
        if (sender == null) {
            throw new IllegalArgumentException("Sender can't be null.");
        }
        this.sender = sender;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp can't be null.");
        }
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content can't be empty.");
        }
        this.content = content;
    }

  
    public String getMessageDetails() {
        return String.format("From: %s\nTo: %s\nTime: %s\nContent: %s",
                sender.getFirstName() + sender.getFirstName(), 
                recipient.getFirstName() + recipient.getFirstName(),  
                timestamp.toString(), 
                content);
    }

    @Override
    public String toString() {
        return String.format("Message{sender='%s', recipient='%s', timestamp='%s', content='%s'}",
        		sender.getFirstName() + sender.getFirstName(),
        		recipient.getFirstName() + recipient.getFirstName(), 
                timestamp.toString(), 
                content);
    }
}
