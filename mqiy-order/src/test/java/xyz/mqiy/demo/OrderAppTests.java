package xyz.mqiy.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.mqiy.demo.component.DubboService;
import xyz.mqiy.demo.service.UserService;
import xyz.mqiy.demo.web.vo.AddOrderIvo;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SpringBootTest
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

//	@Test
//	public void testGe(){
//		log.info("info:"+ userService.getById(233L));
//	}



	@Test
	public void testVal(){
		AddOrderIvo order = new AddOrderIvo();
		order.setProductId(233L);
		validate(order);
	}


	private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

	public static <T> List<String> validate(T t) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

		List<String> messageList = new ArrayList<>();
		for (ConstraintViolation<T> constraintViolation : constraintViolations) {
			messageList.add(constraintViolation.getMessage());
		}
		return messageList;
	}
}
