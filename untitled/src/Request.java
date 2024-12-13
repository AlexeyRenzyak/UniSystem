public class Request extends Message {

    private Manager signedBy;
    private Manager requestRecipient;

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
        //TODO
    }
    
}
