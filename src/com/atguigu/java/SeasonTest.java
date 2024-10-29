package com.atguigu.java;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 上午11:58
 * @description: 自定义枚举类，jdk5.0之前的
 */
 public class SeasonTest {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        String seasonName = winter.getSeasonName();
        System.out.println(seasonName);
        String seasonDesc = winter.getSeasonDesc();
        System.out.println(seasonDesc);
    }
}



//自定义枚举类
class Season{
    //1.声明Season对象的属性  final赋值：1：直接显式赋值  2.代码块中赋值  3.有参构造方法赋值
    private final String seasonName;
    private final String  seasonDesc;

    //2.私有化构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","冰天雪地");

    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}