package com.dksaServer.yujindonut.Week1.study1;

public class Part {

    private String language;

    public void test() {
        System.out.println("부모 클래스 입니다.");
    }

    public Part(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
