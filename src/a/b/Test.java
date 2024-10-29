package a.b;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午2:45
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        One a =new One();
//        a.show();
        InterA b=new Two();
//        b.show();
        zhanshi(a);
        zhanshi(b);
    }

    public static void zhanshi(InterA interA){
        System.out.println("展示");
    }
}


interface Onea{
     InterA haha();
}

class Te implements Onea{
    @Override
    public InterA haha() {
        return new One();
    }
}