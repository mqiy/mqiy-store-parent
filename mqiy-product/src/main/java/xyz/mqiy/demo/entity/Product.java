package xyz.mqiy.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.mqiy.demo.domain.BaseEntity;

/**
 *
 * @author chris
 * @Description 商品实体
 * @Date 2021/5/20 19:12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Product  extends BaseEntity {

    private String name;

    private Integer quantity;
}
