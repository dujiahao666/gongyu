package com.atguigu.java;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午1:44
 * @description:
 */
public enum Season3 implements Info{
    One("嘉嘉",21){
        @Override
        public void show() {
            System.out.println("嘉嘉独有");
        }
    },
    TWO("罡罡",20) ;

    private String name;
    private Integer age;

    private Season3(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Season3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void show() {
        System.out.println("来啊");
    }
}
