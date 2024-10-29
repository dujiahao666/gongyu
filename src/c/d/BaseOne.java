package c.d;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午7:23
 * @description:
 */
public class BaseOne extends Base{
    private String sonName;
    private Integer sonAge;

    public BaseOne() {
    }

    public BaseOne(String sonName, Integer sonAge) {
        this.sonName = sonName;
        this.sonAge = sonAge;
    }

    /**
     * 获取
     * @return sonName
     */
    public String getSonName() {
        return sonName;
    }


    /**
     * 设置
     * @param sonName
     */
    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    /**
     * 获取
     * @return sonAge
     */
    public Integer getSonAge() {
        return sonAge;
    }

    /**
     * 设置
     * @param sonAge
     */
    public void setSonAge(Integer sonAge) {
        this.sonAge = sonAge;
    }

    @Override
    public String toString() {
        return "BaseOne{" +
                "sonName='" + sonName + '\'' +
                ", sonAge=" + sonAge +  '\'' +
                ", babaName" + super.getBabaName()+   '\'' +
                ", babaAge" + super.getBabaAge()+ +  '\'' +
                ", babaId" + super.getId()+
        '}';
    }
}
