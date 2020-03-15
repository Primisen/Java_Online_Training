package com.primisen.basic_of_oop.task1;

public class File {

    private String type;
    private String name;

    enum Type{

        TXT,
        JPG,
        DOCK
    }

    public File(String name) {
        this.name = name;
    }

    public void create(){
    }

    public void remove(){
    }

    public void rename(String name){

        this.name = name;
    }
}
