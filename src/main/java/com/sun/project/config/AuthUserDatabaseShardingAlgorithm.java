/**
 * 
 */
package com.sun.project.config;


import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
import com.google.common.collect.Range;



/**
 * @author wangzhenfei9
 * @version 1.0.0
 * @since 2018年02月08日
 */
public class AuthUserDatabaseShardingAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Long> {
	private static final Logger logger = LoggerFactory.getLogger(AuthUserDatabaseShardingAlgorithm.class);


    private static final int SHARDING_NUMBER = 4;

    public String doEqualSharding(final Collection<String> availableTargetNames, final ShardingValue<Long> shardingValue) {
        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % SHARDING_NUMBER + "")) {
                logger.debug("the target database name: {}", each);
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }

    public Collection<String> doInSharding(final Collection<String> availableTargetNames, final ShardingValue<Long> shardingValue) {
        Collection<String> result = new HashSet<String>(availableTargetNames.size());
        Collection<Long> values = shardingValue.getValues();
        for (Long value : values) {
            for (String each : availableTargetNames) {
                if (each.endsWith(value % SHARDING_NUMBER + "")) {
                    result.add(each);
                }
            }
        }
        return result;
    }

    public Collection<String> doBetweenSharding(final Collection<String> availableTargetNames, final ShardingValue<Long> shardingValue) {
        Collection<String> result = new LinkedHashSet<String>(availableTargetNames.size());
        Range<Long> range = shardingValue.getValueRange();
        for (Long value = range.lowerEndpoint(); value <= range.upperEndpoint(); value++) {
            for (String each : availableTargetNames) {
                if (each.endsWith(value % SHARDING_NUMBER + "")) {
                    result.add(each);
                }
            }
        }
        return result;
    }
}

