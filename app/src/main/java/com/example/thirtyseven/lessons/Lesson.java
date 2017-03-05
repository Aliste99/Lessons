package com.example.thirtyseven.lessons;

/**
 * Created by ThirtySeven on 04.03.2017.
 */

public class Lesson {

    private int lessonNumber;
    private String lessonName;
    private String teacher1;
    private String teacher2;
    private int place;
    private boolean isOdd;

    Lesson(){
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(String teacher1) {
        this.teacher1 = teacher1;
    }

    public String getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(String teacher2) {
        this.teacher2 = teacher2;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isOdd() {
        return isOdd;
    }

    public void setOdd(boolean odd) {
        isOdd = odd;
    }

}
