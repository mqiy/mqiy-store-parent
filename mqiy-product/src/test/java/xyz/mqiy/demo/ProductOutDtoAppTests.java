package xyz.mqiy.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.util.Assert;
import xyz.mqiy.demo.dao.ProductMapper;
import xyz.mqiy.demo.dto.in.ProductAddInDto;
import xyz.mqiy.demo.entity.Product;
import xyz.mqiy.demo.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ProductOutDtoAppTests {

	@Test
	void contextLoads() {
	}


	@Resource
	private ProductService productService;

	@Resource
	private ProductMapper productMapper;

	private static String PRODUCT_NAME="iphone6s";

	@Test
	public void testQuery(){
		ProductAddInDto productAddInDto = new ProductAddInDto();
		productAddInDto.setName(PRODUCT_NAME);
		productAddInDto.setQuantity(233);
		Integer result  = productService.save(productAddInDto);
		Assertions.assertEquals(1,result);
	}



	@Test
	public void testSelect(){
		Product product = new Product();
		product.setName(PRODUCT_NAME);
		product.setQuantity(99);
		List<Product> products = productMapper.select(product);
		Assert.notEmpty(products,"找不到");
	}


}
