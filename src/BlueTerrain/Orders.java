package BlueTerrain;

public class Orders {
    private int orderID;
    private String[] menuOrder;
    private String orderStatus;
    private int chefOrderStatus;
    private long orderTimeStart;
    private long orderPickupTime;
    private String orderDeliveryStatus;
    private long orderDeliveredTime;

    public void handleOrderType() {

    }

    public String updateStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return "Order status updated to: " + orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrder() {
        return String.join(", ", menuOrder);
    }

    public void setOrder(String[] menuOrder) {
        this.menuOrder = menuOrder;
    }

    public void setChefOrderStatus(int orderStatus) {
        this.chefOrderStatus = orderStatus;
    }

    public void setOrderTimeStart() {
        this.orderTimeStart = System.currentTimeMillis();
    }

    public int getOrderTimeStart() {
        return (int) orderTimeStart;
    }

    public void setOrderPickupTime() {
        this.orderPickupTime = System.currentTimeMillis();
    }

    public int getOrderPickupTime() {
        return (int) orderPickupTime;
    }

    public String getOrderDeliveryStatus() {
        return orderDeliveryStatus;
    }

    public void setOrderDeliveryStatus(String status) {
        this.orderDeliveryStatus = status;
    }

    public void setOrderDeliveredTime() {
        this.orderDeliveredTime = System.currentTimeMillis();
    }

    public int getOrderDeliveredTime() {
        return (int) orderDeliveredTime;
    }
}
