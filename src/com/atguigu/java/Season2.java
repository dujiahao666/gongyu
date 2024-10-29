package com.atguigu.java;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午12:40
 * @description: 使用enmu关键字来定义枚举类
 */
public enum Season2 {

    SPRING("春天", "春暖花开"),

    SUMMER("夏天","夏日炎炎"),

    AUTUMN("秋天","秋高气爽"),

    WINTER("冬天","冰天雪地");

    //1.声明Season对象的属性  final赋值：1：直接显式赋值  2.代码块中赋值  3.有参构造方法赋值
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
