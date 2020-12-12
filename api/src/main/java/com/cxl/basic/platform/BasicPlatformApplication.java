package com.cxl.basic.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author cxl
 * @description 启动类
 * @date 2020/11/08 0008
 */
@SpringBootApplication
@MapperScan("com.cxl.basic.platform.dao")
public class BasicPlatformApplication {

    public static void main(String[] args) {

        SpringApplication.run(BasicPlatformApplication.class,args);
    }
}
