package com.primisen.basic_of_oop.task1;

import java.util.Scanner;

public class TextFile extends File {

    private String text;

    public TextFile(String name) {
        super(name);
        Type type = Type.TXT;
    }

    @Override
    public void create(){

        Scanner sc = new Scanner(System.in);

        text = sc.nextLine();
    }

    @Override
    public void remove(){

        text = null;
    }

    public void supplement(String text){

        this.text = this.text.concat(text);
    }

    public void printText(){

        System.out.println(text);
    }
}
