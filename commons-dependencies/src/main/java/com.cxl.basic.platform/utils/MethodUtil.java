package com.cxl.basic.platform.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cxl
 * @description
 * @date 2020/11/08 0008
 */
@Slf4j
public class MethodUtil {

    /**
     * 私有化工具类 防止被实例化
     */
    private MethodUtil() {
    }

    public static String getLineInfo() {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return ste.getFileName() + " -> " + ste.getLineNumber() + "行";
    }

}
