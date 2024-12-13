import java.util.Date;

public class Message {

    private Employee recipient;
    private Employee sender;
    private Date timestamp;
    private String content;

    public Message(Employee recipient, Employee sender, Date timestamp, String content) {
        this.recipient = recipient;
        this.sender = sender;
        this.timestamp = timestamp;
        this.content = content;
    }

    public Employee getRecipient() {
        return recipient;
    }

    public void setRecipient(Employee recipient) {
        this.recipient = recipient;
    }

    public Employee getSender() {
        return sender;
    }

    public void setSender(Employee sender) {
        this.sender = sender;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageDetails() {
        //TODO
        return "";
    }
    
    
}
