package com.sol.knitting.config;

// 현재 스키마 정보를 관리하는 클래스
public class SchemaContext {
    private static final ThreadLocal<String> currentSchema = new ThreadLocal<>();

    public static void setCurrentSchema(String schema) { currentSchema.set(schema); }

    public static String getCurrentSchema() { return currentSchema.get(); }

    public static void clear() { currentSchema.remove(); }
}