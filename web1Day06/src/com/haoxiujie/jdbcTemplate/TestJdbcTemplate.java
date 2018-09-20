package com.haoxiujie.jdbcTemplate;

import com.haoxiujie.utils.JDBCUtils_Druid;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {

    @Test
    public void test1() {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils_Druid.getDataSource());
//        template.query();
    }
}
