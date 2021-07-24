package com.fzy.entity;

public class SysUser {
    private int pkid;
    private String name;
    private String password;

    public int getPkid() {
        return pkid;
    }

    public void setPkid(int pkid) {
        this.pkid = pkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public SysUser(int pkid, String name, String password) {
        this.pkid = pkid;
        this.name = name;
        this.password = password;
    }

    public SysUser() {
    }
}
