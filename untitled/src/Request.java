import java.io.Serializable;
import java.util.Date;

public class Request extends Message implements Serializable {

    private Manager signedBy;
    private Manager requestRecipient;

    public Request(Employee recipient, Employee sender, Date timestamp, String content, Manager requestRecipient) {
        super(recipient, sender, timestamp, content);
        this.requestRecipient = requestRecipient;
    }

    public Manager getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(Manager signedBy) {
        this.signedBy = signedBy;
    }

    public Manager getRequestRecipient() {
        return requestRecipient;
    }

    public void setRequestRecipient(Manager requestRecipient) {
        this.requestRecipient = requestRecipient;
    }

    public void sign(Manager manager) {
        this.signedBy = manager;
        requestRecipient.addRequest(this);
    }
    
}
