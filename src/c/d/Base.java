package c.d;

import com.atguigu.java.Info;

import java.io.Serializable;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/8/2 下午7:21
 * @description:
 */
public  class Base implements Serializable {
    private Long id;
    private String babaName;
    private Integer babaAge;

    public Base() {
    }

    public Base(Long id, String babaName, Integer babaAge) {
        this.id = id;
        this.babaName = babaName;
        this.babaAge = babaAge;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return babaName
     */
    public String getBabaName() {
        return babaName;
    }

    /**
     * 设置
     * @param babaName
     */
    public void setBabaName(String babaName) {
        this.babaName = babaName;
    }

    /**
     * 获取
     * @return babaAge
     */
    public Integer getBabaAge() {
        return babaAge;
    }

    /**
     * 设置
     * @param babaAge
     */
    public void setBabaAge(Integer babaAge) {
        this.babaAge = babaAge;
    }

    public String toString() {
        return "Base{id = " + id + ", babaName = " + babaName + ", babaAge = " + babaAge + "}";
    }
}
