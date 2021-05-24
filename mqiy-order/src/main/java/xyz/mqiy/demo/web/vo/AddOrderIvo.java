package xyz.mqiy.demo.web.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * @author chris
 * @Description TODO
 * @Date 2021/5/24 19:43
 */

@Data
public class AddOrderIvo {

    @NotNull(message = "商品编号不能为空")
    private Long productId;
    @NotNull(message = "用户编号不能为空")
    private Long userId;
    @NotNull(message = "数量不能为空")
    @Positive(message = "数量不合法")
    private Integer quantity;
}
