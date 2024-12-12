import java.util.Vector;

public class TechSupporter extends Employee {

    private int supportId;
    private Order orderInWork;
    private Vector<Order> orders;

    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public Order getOrderInWork() {
        return orderInWork;
    }

    public void setOrderInWork(Order orderInWork) {
        this.orderInWork = orderInWork;
    }

    public Vector<Order> getOrders() {
        return orders;
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

    public void viewNewOrders() {
        //TODO
    }

    public void acceptOrder() {
        //TODO
    }

    public void markOrderAsDone() {
        //TODO
    }
    
    
}
