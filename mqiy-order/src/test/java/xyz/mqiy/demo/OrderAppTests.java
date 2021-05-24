package xyz.mqiy.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.mqiy.demo.compoent.DubboService;
import xyz.mqiy.demo.service.UserService;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class OrderAppTests {

	@Test
	void contextLoads() {
	}

	@Resource
	DubboService dubboService;

	@Test
	public void testDubbo(){
		dubboService.testCall();
	}

	@Reference
	UserService userService;

	@Test
	public void testGe(){
		log.info("info:"+ userService.getById(233L));
	}

}
