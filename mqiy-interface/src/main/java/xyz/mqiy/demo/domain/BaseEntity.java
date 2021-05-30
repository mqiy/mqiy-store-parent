package xyz.mqiy.demo.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author chris
 * @Description 基础实体
 * @Date 2021/5/30 17:31
 */

@Data
public class BaseEntity {

    /**
     * 自增主键
     */
    private Long id;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

}
