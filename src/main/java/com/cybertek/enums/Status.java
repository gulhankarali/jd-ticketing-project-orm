package com.cybertek.enums;

public enum Status {
    OPEN("Open"), IN_PROGRESS("In Progress"), UAT_TEST("UAT Testing"), COMPLETE("Completed");

    private String value;

    private Status(String value){
        this.value= value;
    }
    public String getValue(){
        return this.value;
    }
}
