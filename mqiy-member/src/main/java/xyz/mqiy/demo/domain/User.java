package xyz.mqiy.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/20 19:12
 */

@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private Integer age;
}
