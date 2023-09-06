package com.example.javacore.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SqlQueryBuilder {

    public static String buildQuerySql(Map<String, Object> paramMap) {
        StringBuilder sql = new StringBuilder("SELECT * FROM aaa WHERE 1=1");

        List<String> conditions = new ArrayList<>();
        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            if (fieldValue != null) {
                String condition;
                if (fieldValue instanceof String) {
                    condition = fieldName + " = '" + fieldValue + "'";
                } else {
                    condition = fieldName + " = " + fieldValue;
                }
                conditions.add(condition);
            }
        }

        if (!conditions.isEmpty()) {
            String joinedConditions = conditions.stream()
                    .collect(Collectors.joining(" AND "));
            sql.append(" AND ").append(joinedConditions);
        }

        return sql.toString();
    }

    public static void main(String[] args) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("field1","value1");
        paramMap.put("field2",123);
        paramMap.put("field3",null);


        String querySql = buildQuerySql(paramMap);
        System.out.println(querySql);
    }
}
