package xyz.mqiy.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "xyz.mqiy.demo.service")
public class UserApp {

	public static void main(String[] args) {
		SpringApplication.run(UserApp.class, args);
	}

}
