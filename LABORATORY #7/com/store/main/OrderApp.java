package com.store.main;

import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        OnlineOrder order1 = new OnlineOrder(1, 100.0);
        OnlineOrder order2 = new OnlineOrder(2, 200.0);
        OnlineOrder order3 = new OnlineOrder(3, 300.0);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        order1.processOrder();
        order1.pay();

        order2.processOrder();
        order2.pay();

        order3.processOrder();
        order3.cancelOrder();

        Iterator<Order> iterator = orders.iterator();
        System.out.println("\nOrder Summary:");
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderSummary());
            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
            }
        }
    }
}
