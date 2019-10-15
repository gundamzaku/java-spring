package com.tantanwen.mybatissharding.config;


import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Slf4j
@Configuration
public class DataSourceConfig {

    @Autowired
    DataSourceUtil dataSourceUtil;

    @Bean
    public DataSource getDataSource() throws SQLException {
        //ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        //shardingRuleConfig.getBroadcastTables().add("t_country");

        // 配置Order表规则
        //TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration("t_order","ds${0..1}.t_order_${0..1}");
        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration("t_order","ds0.t_order_${0..1}");
        // 配置分库 + 分表策略
        //orderTableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "ds${user_id % 2}"));
        orderTableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("order_id", "t_order_${order_id % 2}"));

        // 配置分片规则
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(orderTableRuleConfig);

        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, new Properties());
    }

    private Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> result = new HashMap<>();
        result.put("ds0", dataSourceUtil.createDataSource());
        //result.put("ds1", dataSourceUtil.createDataSource());
        return result;
    }

}
