package com.dksaServer.yujindonut.study1;

public class Server extends Part {

    private String study;

    @Override
    public void test() {
        super.test();
        System.out.println("자식 클래스 입니다");
    }

    public Server(String language) {
        super(language);
    }

    public Server(String language, String study) {
        super(language);
        this.study = study;
    }

    @Override
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override
    public void setLanguage(String language) {
        super.setLanguage(language);
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }
}
