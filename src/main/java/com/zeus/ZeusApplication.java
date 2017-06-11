package com.zeus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
//@MapperScan("com.zeus.mapper")
@SpringBootApplication
@ServletComponentScan
public class ZeusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeusApplication.class, args);
	}
}
