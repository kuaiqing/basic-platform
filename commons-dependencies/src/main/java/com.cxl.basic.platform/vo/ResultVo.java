package com.cxl.basic.platform.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cxl
 * @description
 * @date 2020/11/08 0008
 */
@Data
@ApiModel("固定返回格式")
public class ResultVo {

    /**
     * 错误码
     */
    @ApiModelProperty("错误码")
    private Integer code;

    /**
     * 提示信息
     */
    @ApiModelProperty("提示信息")
    private String message;

    /**
     * 具体的内容
     */
    @ApiModelProperty("响应数据")
    private Object data;

}
