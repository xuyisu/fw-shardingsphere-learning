package com.yisu.shardingsphere.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author xuyisu
 * @description 分表配置
 * @date 2020/3/14
 */
public class ShardingTableAlgorithmConfig implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<Long> shardingValue) {
        for (String each : tableNames) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new RuntimeException("没有需要分的表");
    }
}
