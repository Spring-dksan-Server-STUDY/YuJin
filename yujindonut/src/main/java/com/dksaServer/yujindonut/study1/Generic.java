package com.dksaServer.yujindonut.study1;

public class Generic<T> {

    private T data;

    /// 다중적으로 제네릭 타입 선언 가능함
//    private S dataS;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Generic(T data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(data);
    }
}
