import java.util.Date;

public class Order extends Message {

    private Employee assignedTo;
    private Date createdAt;
    private Date completedAt;
    private boolean status;
    private String description;
    private int orderId;
    private TechSupporter techSupporter;

    public Employee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public TechSupporter getTechSupporter() {
        return techSupporter;
    }

    public void setTechSupporter(TechSupporter techSupporter) {
        this.techSupporter = techSupporter;
    }

    public void acceptOrder() {
        //TODO
    }
    public void rejectOrder() {
        //TODO
    }
    public void markAsDone() {
        //TODO
    }
    public String getOrderDetails() {
        //TODO
        return "";
    }
    
    
}
