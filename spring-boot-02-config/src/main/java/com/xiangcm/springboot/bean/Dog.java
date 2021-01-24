package com.xiangcm.springboot.bean;

/**
 * @ClassName: Dog
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/24 17:56
 **/
public class Dog {
    private String name;
    private Integer ages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAges() {
        return ages;
    }

    public void setAges(Integer ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }
}
