package com.cxl.basic.platform.form;

/**
 * @author cxl
 * @description
 * @date 2020/11/08 0008
 */
public abstract class BaseForm<T> {

    /**
     * 获取实例
     * @return 返回实体类
     */
    public abstract T buildEntity();

}
