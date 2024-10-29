package c.d;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午7:33
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        BaseOne baseOne = new BaseOne();
        baseOne.setSonAge(6);
        baseOne.setSonName("大儿子");
        baseOne.setBabaName("马云");
        baseOne.setBabaAge(30);
        baseOne.setId(1l);
        System.out.println(baseOne);

        System.out.println("===============");

        BaseTwo baseTwo = new BaseTwo();
        baseTwo.setSonAge(2);
        baseTwo.setSonName("小儿子");
        baseTwo.setBabaName("张三");
        baseTwo.setBabaAge(38);
        baseTwo.setId(6l);
        System.out.println(baseTwo);
    }
}
