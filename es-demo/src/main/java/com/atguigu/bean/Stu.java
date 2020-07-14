package com.atguigu.bean;

/**
 * @author Lh
 * @create 2020-07-11 11:40
 */
public class Stu {
    private String name;
    private Long age;

    public Stu(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
