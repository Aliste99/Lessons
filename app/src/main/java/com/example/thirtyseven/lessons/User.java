package com.example.thirtyseven.lessons;

/**
 * Created by ThirtySeven on 04.03.2017.
 */

public class User {

    private String name;
    private String secondName;
    private String facult;
    private int groupNumber;
    private boolean elder;

    User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public boolean isElder() {
        return elder;
    }

    public void setElder(boolean elder) {
        this.elder = elder;
    }

}
