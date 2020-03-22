package com.yisu.shardingsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description 启动类
 * @author xuyisu
 * @date '2020-03-22'
 */
@SpringBootApplication
public class FwShardingsphereSubDbTable {

    public static void main(String[] args) {
        SpringApplication.run(FwShardingsphereSubDbTable.class, args);
    }

}

