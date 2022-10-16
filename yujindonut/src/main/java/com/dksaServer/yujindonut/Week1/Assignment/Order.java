package com.dksaServer.yujindonut.Week1.Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    // 주문번호
    private Long orderId;

    // 주문한 사람
    private Customer userId;

    // 주문 시간
    private LocalDateTime orderDate;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getUserId() {
        return userId;
    }

    public void setUserId(Customer userId) {
        this.userId = userId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public List<String> getOrderItems() { return orderItems; }


    public void setOrderItems(List<String> orderItems) { this.orderItems = orderItems; }

    // 주문한 아이템
    private List<String> orderItems = new ArrayList<>();

    public void addOrderItem(String orderItem){
        orderItems.add(orderItem);
    }

    public static Order createOrder(Long orderId, Customer userId, List<String> orderItems) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setOrderDate(LocalDateTime.now());
        order.setOrderItems(orderItems);
        return order;
    }
}
