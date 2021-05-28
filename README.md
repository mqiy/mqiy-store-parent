# mqiy-store-parent
dubbo lean




### 接入 bean validate
pom.xml中添加
```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
```


## dubbo-spring-boot-starter 2.0.0 使用

1, 启动类上添加`@EnableDubbo`注解,并指定scanBasePackages属性
2, 服务实现类上添加@com.alibaba.dubbo.config.annotation.Service注解
3，消费时，使用@Reference引用
