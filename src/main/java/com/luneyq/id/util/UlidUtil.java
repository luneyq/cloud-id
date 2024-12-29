package com.luneyq.id.util;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

/**
 * ULID算法的工具类
 */
public class UlidUtil {

    /**
     * 生成ULID
     */
    public static String ulid() {
        Ulid ulid = UlidCreator.getUlid();
        return ulid.toString();
    }

    /**
     * 生成Monotonic ULID：
     * 是ULID的一个变种，在相同毫秒内生成的ULID能够保持单调递增的顺序。
     * 需要在同一时间点生成多个唯一标识符时非常有用，特别是在分布式系统中
     */
    public static String ulidMonotonic() {
        Ulid ulid = UlidCreator.getMonotonicUlid();
        return ulid.toString();
    }

    /**
     * 为特定的特定时间和名称参数返回相同的ULID
     * @param time 毫秒时间
     * @param name 名称
     * @return
     */
    public static String ulidHash(long time, String name) {
        Ulid ulid = UlidCreator.getHashUlid(time, name);
        return ulid.toString();
    }

    /**
     * 获取ulid创建时间
     * @param ulid
     * @return 毫秒时间
     */
    public static long getTime(String ulid) {
        return Ulid.getTime(ulid);
    }

    /**
     * 判断ULID有效性
     * @param ulid
     * @return
     */
    public static boolean isValid(String ulid) {
        return Ulid.isValid(ulid);
    }

}
