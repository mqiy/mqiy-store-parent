package xyz.mqiy.demo.domain;

import lombok.Data;

/**
 *
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */

@Data
public class Order {

    private Long id;

    private String name;

    private Integer productId;
}
