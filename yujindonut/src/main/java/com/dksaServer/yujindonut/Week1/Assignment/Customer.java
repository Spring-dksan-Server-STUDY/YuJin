package com.dksaServer.yujindonut.Week1.Assignment;

public class Customer {

    private int customerId;
    private int age;
    private String name;
    private Address address;

    public Customer(int customerId, int age, String name, Address address) {
        this.customerId = customerId;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
