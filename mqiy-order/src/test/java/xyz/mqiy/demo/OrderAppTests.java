package xyz.mqiy.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.mqiy.demo.service.UserService;
import xyz.mqiy.demo.web.vo.AddOrderIvo;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class OrderAppTests {

	@Test
	void contextLoads() {
	}

//	@Resource
//	DubboService dubboService;
//
//	@Test
//	public void testDubbo(){
//		dubboService.testCall();
//	}
	@Resource
	UserService userService;

	@Test
	public void testGe(){
		log.info("info:"+ userService.getById(233L));
	}

	@Test
	public void testVal(){
		AddOrderIvo order = new AddOrderIvo();
		order.setProductId(233L);
	}

}
