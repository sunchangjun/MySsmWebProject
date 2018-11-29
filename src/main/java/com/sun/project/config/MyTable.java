/**
 * 
 */
package com.sun.project.config;

import java.util.Collection;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;

/**
 * @author sunchangjunn
 * 2018年11月28日下午5:53:29
 */
public class MyTable implements SingleKeyTableShardingAlgorithm<Comparable<?>> {

	/* (non-Javadoc)
	 * @see com.dangdang.ddframe.rdb.sharding.routing.strategy.SingleKeyShardingAlgorithm#doEqualSharding(java.util.Collection, com.dangdang.ddframe.rdb.sharding.api.ShardingValue)
	 */
	public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Comparable<?>> shardingValue) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dangdang.ddframe.rdb.sharding.routing.strategy.SingleKeyShardingAlgorithm#doInSharding(java.util.Collection, com.dangdang.ddframe.rdb.sharding.api.ShardingValue)
	 */
	public Collection<String> doInSharding(Collection<String> availableTargetNames,
			ShardingValue<Comparable<?>> shardingValue) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dangdang.ddframe.rdb.sharding.routing.strategy.SingleKeyShardingAlgorithm#doBetweenSharding(java.util.Collection, com.dangdang.ddframe.rdb.sharding.api.ShardingValue)
	 */
	public Collection<String> doBetweenSharding(Collection<String> availableTargetNames,
			ShardingValue<Comparable<?>> shardingValue) {
		// TODO Auto-generated method stub
		return null;
	}



}
