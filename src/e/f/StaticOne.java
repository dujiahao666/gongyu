package e.f;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午8:24
 * @description:
 */
public  class StaticOne {
    private  int age;


    public StaticOne() {
    }

    public StaticOne(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}


class Test{
    public static void main(String[] args) {
        StaticOne staticOne = new StaticOne();
        staticOne.setAge(3);
        StaticOne staticOne1 = new StaticOne();
        staticOne1.setAge(2);
        System.out.println(staticOne1.getAge());
        System.out.println(staticOne.getAge());
        System.out.println(staticOne);
        System.out.println(staticOne1);
    }
}