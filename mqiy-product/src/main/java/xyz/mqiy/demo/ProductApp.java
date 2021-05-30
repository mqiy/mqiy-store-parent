package xyz.mqiy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "xyz.mqiy.demo.dao")
public class ProductApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductApp.class, args);
	}

}
