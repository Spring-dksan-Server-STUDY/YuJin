package com.dksaServer.yujindonut.Week1.Assignment;

import com.dksaServer.yujindonut.Week1.study1.User;

public class OrderService implements OrderInterface{

    @Override
    public void order(Customer customer) {
        System.out.println(customer.getName() + "님 " + OrderInterface.shop + "을 주문하셨습니다.");
    }

    @Override
    public void orderInfo(String menu, Customer name) {
        OrderInterface.super.orderInfo(menu, name);
    }

    public void introduceShop() {
        System.out.println(OrderInterface.shop + "입니다.");
        OrderInterface.popularMenu();
    }
}
