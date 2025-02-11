package com.sol.knitting.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MultiSchemaConfig {

    private final SchemaReader schemaReader;

    @Autowired
    public MultiSchemaConfig(@Lazy SchemaReader schemaReader) {
        this.schemaReader = schemaReader;
    }

    @Bean
    public DataSource dataSource() {
        AbstractRoutingDataSource routingDataSource = new AbstractRoutingDataSource() {
            @Override
            protected Object determineCurrentLookupKey() {
                return SchemaContext.getCurrentSchema();
            }
        };

        // 데이터베이스에서 모든 스키마 이름 가져오기
        List<String> schemas = schemaReader.getAllSchemaNames();
        Map<Object, Object> targetDataSources = new HashMap<>();

        for (String schema: schemas) {
            targetDataSources.put(schema, dataSource(schema));
        }
        routingDataSource.setDefaultTargetDataSource(dataSource(schemas.get(0)));
        routingDataSource.setTargetDataSources(targetDataSources);
        return routingDataSource;
    }

    private DataSource dataSource(String schemaName) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3307/" + schemaName + "?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul");
        dataSource.setUsername("root");
        dataSource.setPassword("1111");
        return dataSource;
    }

}


