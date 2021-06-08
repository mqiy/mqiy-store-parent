package xyz.mqiy.demo.dto.in;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */

@Data
public class UserAddInDto implements Serializable {

    private static final long serialVersionUID = -787629444998501611L;

    private String name;

    private Integer age;
}
