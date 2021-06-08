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

CREATE TABLE `product` (
                           `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增主键',
                           `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '商品名称',
                           `quantity` int NOT NULL DEFAULT '0' COMMENT '库存',
                           `status` tinyint NOT NULL DEFAULT '0' COMMENT ' 状态',
                           `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `created_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '创建者',
                           `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                           `updated_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '更新者',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC COMMENT='商品表';



```

### 显示 sql
```yml
# mybatis show sql

logging:
  level:
    xyz.mqiy.demo.dao : debug
```