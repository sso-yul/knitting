package com.sol.knitting.config;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.List;

// 모든 스키마 읽어오는 클래스
@Component
public class SchemaReader implements HandlerInterceptor {

    private final JdbcTemplate jdbcTemplate;

    public SchemaReader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getAllSchemaNames() {
        return jdbcTemplate.queryForList("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA", String.class);
    }

}
