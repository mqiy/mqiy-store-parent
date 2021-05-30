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


### sql
```sql

create database  `product` default character set utf8mb4 collate utf8mb4_general_ci;
create database  `member` default character set utf8mb4 collate utf8mb4_general_ci;
create database  `order` default character set utf8mb4 collate utf8mb4_general_ci;
```