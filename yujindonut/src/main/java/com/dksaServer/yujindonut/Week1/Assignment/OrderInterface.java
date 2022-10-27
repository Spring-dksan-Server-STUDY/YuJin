package com.dksaServer.yujindonut.Week1.Assignment;


public interface OrderInterface {

    // 상수 (절대적) : 인터페이스에서만 제공하는 값만 사용가능
    String shop = "Ourbakery";

    // 추상 메소드 (강제적) - 오버라이딩 필요, 메소드 틀만 제공
    void order(Customer userId);

    // 디폴트 메소드 (선택적) - 구현의무 없다. 오버라이딩을 통해 재구현은 가능
    default void orderInfo(String menu, Customer customer){
        System.out.println(customer.getName() + "님은 " + menu + "를 주문하셨다.");
        System.out.println(customer.getAddress());
    }

    // 정적 메소드 (절대적) : 인터페이스에서 제공하는대로만 사용 가능
    static void popularMenu(){
        System.out.println("우리 주력 메뉴는 더티초코인 것 같지만 까눌레랑 앙버터도 맛있다.\n");
    }

}
