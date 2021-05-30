package xyz.mqiy.demo.dto.in;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chris
 * @Description 商品新增入参
 * @Date 2021/5/30 17:46
 */

@Data
public class ProductAddInDto implements Serializable {
    private static final long serialVersionUID = -5942406558606844784L;

    private String name;

    private Integer quantity;
}
