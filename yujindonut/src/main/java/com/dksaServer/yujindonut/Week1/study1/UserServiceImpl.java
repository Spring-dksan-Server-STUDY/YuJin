package com.dksaServer.yujindonut.Week1.study1;

public class UserServiceImpl implements UserInterface{
    @Override
    public void introduce(String name, String mbti) {
        System.out.println("추상 메소드");
        System.out.println("이름: " + name + ", mbti: " + mbti);
    }

    @Override
    public void getInfo(int generation, String part) {
        UserInterface.super.getInfo(generation, part);
    }

    public void getSopt() {
        UserInterface.introduceSOPT();
        // static은 클래스.메소드()로 바로 불러와야함
    }
}
