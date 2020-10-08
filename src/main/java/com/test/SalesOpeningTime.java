package com.test;

import java.time.LocalTime;

public class SalesOpeningTime {
    private String type;
    private static String OBJ_TYPE = "PARTS";
    private LocalTime mondayOpeningTime;
    private LocalTime tuesdayOpeningTime;
    private LocalTime wednesdayOpeningTime;
    private LocalTime thursdayOpeningTime;
    private LocalTime fridayOpeningTime;
    private LocalTime saturdayOpeningTime;
    private LocalTime sundayOpeningTime;

    public String getType() {
        return OBJ_TYPE;
    }

    public LocalTime getMondayOpeningTime() {
        return mondayOpeningTime;
    }

    public void setMondayOpeningTime(LocalTime mondayOpeningTime) {
        this.mondayOpeningTime = mondayOpeningTime;
    }

    public LocalTime getTuesdayOpeningTime() {
        return tuesdayOpeningTime;
    }

    public void setTuesdayOpeningTime(LocalTime tuesdayOpeningTime) {
        this.tuesdayOpeningTime = tuesdayOpeningTime;
    }

    public LocalTime getWednesdayOpeningTime() {
        return wednesdayOpeningTime;
    }

    public void setWednesdayOpeningTime(LocalTime wednesdayOpeningTime) {
        this.wednesdayOpeningTime = wednesdayOpeningTime;
    }

    public LocalTime getThursdayOpeningTime() {
        return thursdayOpeningTime;
    }

    public void setThursdayOpeningTime(LocalTime thursdayOpeningTime) {
        this.thursdayOpeningTime = thursdayOpeningTime;
    }

    public LocalTime getFridayOpeningTime() {
        return fridayOpeningTime;
    }

    public void setFridayOpeningTime(LocalTime fridayOpeningTime) {
        this.fridayOpeningTime = fridayOpeningTime;
    }

    public LocalTime getSaturdayOpeningTime() {
        return saturdayOpeningTime;
    }

    public void setSaturdayOpeningTime(LocalTime saturdayOpeningTime) {
        this.saturdayOpeningTime = saturdayOpeningTime;
    }

    public LocalTime getSundayOpeningTime() {
        return sundayOpeningTime;
    }

    public void setSundayOpeningTime(LocalTime sundayOpeningTime) {
        this.sundayOpeningTime = sundayOpeningTime;
    }
}
