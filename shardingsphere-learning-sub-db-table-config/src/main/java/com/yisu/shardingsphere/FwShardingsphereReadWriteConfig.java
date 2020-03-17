package com.yisu.shardingsphere;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 启动类
 * @author xuyisu
 * @date '2020-03-10'
 */
@SpringBootApplication(exclude = SpringBootConfiguration.class)
public class FwShardingsphereReadWriteConfig {

    public static void main(String[] args) {
        SpringApplication.run(FwShardingsphereReadWriteConfig.class, args);
    }

}

