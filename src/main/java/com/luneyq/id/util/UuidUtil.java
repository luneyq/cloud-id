package com.luneyq.id.util;

import com.luneyq.id.snowflake.BasicEntityIdGenerator;

/**
 * UUID算法的工具类.
 */
public class UuidUtil {

    /**
     * 基于twitter的snowflake算法生成可排序的uuid
     */
    public static String uuid() {
        try {
//            return UUID.randomUUID().toString().replace("-","");
            return BasicEntityIdGenerator.getInstance().generateLongId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
