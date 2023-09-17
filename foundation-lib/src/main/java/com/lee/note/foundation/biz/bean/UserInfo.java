package com.lee.note.foundation.biz.bean;

public class UserInfo {
    private String userName;
    private Integer age;

    public UserInfo(String username, Integer age) {
        this.userName = username;
        this.age = age;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }
}
