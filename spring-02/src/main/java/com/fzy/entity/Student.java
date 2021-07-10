package com.fzy.entity;

import java.util.*;

public class Student {
    private int pkid;
    private String name;
    private Teacher teacher;
    private List stulist;
    private Map stumap;
    private Set stuset;
    private Properties properties;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List getStulist() {
        return stulist;
    }

    public void setStulist(List stulist) {
        this.stulist = stulist;
    }

    public Map getStumap() {
        return stumap;
    }

    public void setStumap(Map stumap) {
        this.stumap = stumap;
    }

    public Set getStuset() {
        return stuset;
    }

    public void setStuset(Set stuset) {
        this.stuset = stuset;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "pkid=" + pkid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", stulist=" + stulist +
                ", stumap=" + stumap +
                ", stuset=" + stuset +
                ", properties=" + properties +
                '}';
    }
}
