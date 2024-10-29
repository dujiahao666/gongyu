package c.d;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午7:23
 * @description:
 */
public class BaseTwo extends Base{
    private String sonName2;
    private Integer sonAge2;

    public BaseTwo() {
    }

    public BaseTwo(String sonName, Integer sonAge) {
        this.sonName2 = sonName;
        this.sonAge2 = sonAge;
    }

    /**
     * 获取
     * @return sonName
     */
    public String getSonName() {
        return sonName2;
    }

    /**
     * 设置
     * @param sonName
     */
    public void setSonName(String sonName) {
        this.sonName2 = sonName;
    }

    /**
     * 获取
     * @return sonAge
     */
    public Integer getSonAge() {
        return sonAge2;
    }

    /**
     * 设置
     * @param sonAge
     */
    public void setSonAge(Integer sonAge) {
        this.sonAge2 = sonAge;
    }



    @Override
    public String toString() {
        return "BaseOne{" +
                "sonName='" + sonName2 + '\'' +
                ", sonAge=" + sonAge2 +  '\'' +
                ", babaName" + super.getBabaName()+   '\'' +
                ", babaAge" + super.getBabaAge()+ +  '\'' +
                ", babaId" + super.getId()+
                '}';
    }
}
