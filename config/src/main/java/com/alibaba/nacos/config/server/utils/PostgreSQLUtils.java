
package com.alibaba.nacos.config.server.utils;

import com.alibaba.nacos.sys.env.EnvUtil;

public final class PostgreSQLUtils {

    public static boolean isPostgreSQL() {
        return "postgresql".equals(EnvUtil.getProperty("spring.datasource.platform"));
    }
}
