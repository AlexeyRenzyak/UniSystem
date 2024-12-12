public class Complaint extends Message {

    private ComplaintUrgency urgency;

    public ComplaintUrgency getUrgency() {
        return urgency;
    }

    public void setUrgency(ComplaintUrgency urgency) {
        this.urgency = urgency;
    }
}
