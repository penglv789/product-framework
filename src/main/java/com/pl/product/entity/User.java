package com.pl.product.entity;

public class User {
    private Long id;
    private String pf_username;
    private String pf_password;
    private Integer age;

    public User(Long id, String pf_username, String pf_password, Integer age) {
        this.id = id;
        this.pf_username = pf_username;
        this.pf_password = pf_password;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPf_username() {
        return pf_username;
    }

    public void setPf_username(String pf_username) {
        this.pf_username = pf_username;
    }

    public String getPf_password() {
        return pf_password;
    }

    public void setPf_password(String pf_password) {
        this.pf_password = pf_password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
