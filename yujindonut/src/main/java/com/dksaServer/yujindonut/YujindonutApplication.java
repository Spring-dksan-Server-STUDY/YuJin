package com.dksaServer.yujindonut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YujindonutApplication {

	public static void main(String[] args) {

		SpringApplication.run(YujindonutApplication.class, args);

/*
		User user = new User(1, "한유진", "서버");
		user.introduce();

		user.setName("양지용");
		user.setPart("안드로이드");
//		String name = user.getName();
//		System.out.println(name);
		user.introduce();

		UserServiceImpl userService = new UserServiceImpl();
		String club = userService.Club;
		System.out.println(club);

		userService.introduce("한유진", "ISPJ");
		userService.getSopt();

		Server server = new Server("한유진", "Spring" );
		server.test();

		// 제네릭 사용
		Generic<String> generic1 = new Generic<>("한유진");
		Generic<Integer> generic2 = new Generic<>(10);
		generic1.printData();
		generic2.printData();
*/

		// 과제

//		Address address1 = new Address("서울시", "용산구", "이태원동");
//		Customer customer1 = new Customer(1, 10, "키에리", address1);
//		OrderService orderService = new OrderService();
//
//		Address address2 = new Address("부산시", "부산진구", "전포동");
//		Customer customer2 = new Customer(2, 11, "희와제과", address2);
//
//		orderService.order(customer1);
//		orderService.orderInfo("케이크", customer1);
//		orderService.introduceShop();
//
//		orderService.order(customer2);
//		orderService.orderInfo("밤팥빵", customer2);
//		orderService.introduceShop();
	}

}
