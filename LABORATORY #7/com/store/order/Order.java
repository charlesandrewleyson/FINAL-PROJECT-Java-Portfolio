package com.store.order;

public abstract class Order {

    private int orderId;
    private double amount;
    private OrderStatus status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = OrderStatus.PENDING;
    }

    public abstract void processOrder();

    public String getOrderSummary() {
        return "Order ID: " + orderId +
               ", Amount: " + amount +
               ", Status: " + status;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    protected void setStatus(OrderStatus status) {
        this.status = status;
    }
}
