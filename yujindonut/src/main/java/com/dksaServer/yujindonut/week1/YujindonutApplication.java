package com.dksaServer.yujindonut.week1;

import com.dksaServer.yujindonut.study1.Generic;
import com.dksaServer.yujindonut.study1.Server;
import com.dksaServer.yujindonut.study1.User;
import com.dksaServer.yujindonut.study1.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YujindonutApplication {

	public static void main(String[] args) {

		SpringApplication.run(YujindonutApplication.class, args);

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

	}

}
