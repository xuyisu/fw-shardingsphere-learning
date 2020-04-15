package com.yisu.shardingsphere.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

@Slf4j
public class MyShardingDatabaseAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<String> shardingValue) {
        String targetTable = shardingValue.getValue();
        if (availableTargetNames.contains(targetTable)){
            return targetTable;
        }

        throw new UnsupportedOperationException("无法判定的值: " + shardingValue.getValue());
    }
}
