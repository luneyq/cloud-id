package com.luneyq.id.util;


import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UlidUtilTest {


    @Test
    void ulid() {
        System.out.println("ULID: " + UlidUtil.ulid());
    }

    @Test
    void ulidMonotonic() {
        System.out.println("单调ULID：");
        for (int i = 0; i < 10; i++) {
            System.out.println(UlidUtil.ulidMonotonic());
        }
    }

    @Test
    void ulidHash() {
        System.out.println("哈希ULID：");
        long time = System.currentTimeMillis();
        String name = "test";
        System.out.println(UlidUtil.ulidHash(time, name));
        System.out.println(UlidUtil.ulidHash(time, name));
    }

    @Test
    void getTime() {
        System.out.println("获取ULID创建时间：");
        long time = UlidUtil.getTime("01JG82113PYER9VMRVYR6M5T69");
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strTime = sdf.format(new Date(time)); // 格式化日期
        System.out.println(strTime);
    }

    @Test
    void isValid() {
        System.out.println("01JG82113PYER9VMRVYR6M5T69: " + UlidUtil.isValid("01JG82113PYER9VMRVYR6M5T69"));
        System.out.println("abc: " + UlidUtil.isValid("abc"));
    }
}
