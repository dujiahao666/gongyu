package com.atguigu.java;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午1:32
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Season3 sPring = Season3.valueOf("One");
        System.out.println(sPring);
        sPring.show();
        Season3 two = Season3.TWO;
        two.show();

    }
}
