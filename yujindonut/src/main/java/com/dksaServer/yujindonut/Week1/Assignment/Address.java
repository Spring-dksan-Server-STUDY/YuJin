package com.dksaServer.yujindonut.Week1.Assignment;

public class Address {

    private String city;
    private String gu;
    private String dong;

    public Address(String city, String gu, String dong) {
        this.city = city;
        this.gu = gu;
        this.dong = dong;
    }

    @Override
    public String toString() {
        return "주소는 " + city + gu + dong + "입니다";
    }
}
