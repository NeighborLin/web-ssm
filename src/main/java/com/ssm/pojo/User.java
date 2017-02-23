package com.ssm.pojo;

/**
 * Created by Tong on 2017/2/22.
 */
public class User {
    private int id;
    private String name;
    private String sex;

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
}
