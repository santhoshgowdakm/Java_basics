package com.basics.collections;

public class Students {
    public Students(Integer studID, String studName, String studCourse) {
        this.studID = studID;
        StudName = studName;
        StudCourse = studCourse;
    }
    public Students(){

    }

    @Override
    public String toString() {
        return "Students{" +
                "studID=" + studID +
                ", StudName='" + StudName + '\'' +
                ", StudCourse='" + StudCourse + '\'' +
                '}';
    }

    private Integer studID;
    private String StudName;
    private String StudCourse;
    public Integer getStudID() {
        return studID;
    }

    public void setStudID(Integer studID) {
        this.studID = studID;
    }

    public String getStudName() {
        return StudName;
    }

    public void setStudName(String studName) {
        StudName = studName;
    }

    public String getStudCourse() {
        return StudCourse;
    }

    public void setStudCourse(String studCourse) {
        StudCourse = studCourse;
    }



}
