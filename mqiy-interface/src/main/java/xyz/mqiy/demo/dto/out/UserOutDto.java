package xyz.mqiy.demo.dto.out;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */

@Data
public class UserOutDto implements Serializable {

    private static final long serialVersionUID = -787629444998501611L;

    private Long id;

    private String name;

    private Integer age;
}
