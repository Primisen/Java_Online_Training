package com.primisen.string.pattern_matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Дана строка, содержащая следующий текст (xml-документ):
<notes>
     <note id = "1">
         <to>Вася</to>
         <from>Света</from>
         <heading>Напоминание</heading>
         <body>Позвони мне завтра!</body>
     </note>
     <note id = "2">
         <to>Петя</to>
         <from>Маша</from>
         <heading>Важное напоминание</heading>
         <body/>
     </note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */
public class Task2 {

    public static void main(String[] args){

        String xmlFile = readFile("text.xml");

        getTags(xmlFile);
    }

    private static void getTags(String xmlFile){

//        String strPattern = "<.*/>"; pustoi body
//        String strPattern = "^[^/>]+>"; только открывающие
//        String strPattern = "</.*>"; closing
//        String strPattern = "<[^<]+>"; all tags MOST IMPORTANT !!!!!!!!!!!!!!

        String strPatternAllTags = "<[^<]+>";
        Pattern pattern = Pattern.compile(strPatternAllTags, Pattern.MULTILINE);
        Matcher matcherAllTags = pattern.matcher(xmlFile);

        String strPatternCloseTags = "</.*>";
        Pattern patternCloseTags = Pattern.compile(strPatternCloseTags, Pattern.MULTILINE);
        Matcher matcherCloseTags = patternCloseTags.matcher(xmlFile);

//        matcherAllTags.find();
        while (matcherAllTags.find()){

            String str = matcherAllTags.group();
            System.out.println(str);

            System.out.println("Name: " + getTagName(str));
            System.out.println("Body:\n" + getTagBody(getTagName(str), xmlFile));
//            System.out.println(conceptOfTags(str));

        }
    }

    private static String getTagName(String string){

        String strPattern = "[^</> ]+";

        Pattern pattern = Pattern.compile(strPattern, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);
        matcher.find();

        return matcher.group();
    }

    private static String getTagBody(String tagName, String text){
        String strPattern = "(?s)<" + tagName + "[^<]*>(.*)</" + tagName + ">" ;

        Pattern pattern = Pattern.compile(strPattern, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);
        matcher.find();

        return matcher.group(1);
    }

    private static String readFile(String fileName) {

        File fileToRead = new File(fileName);

        Scanner scanner = null;
        try {
            scanner = new Scanner(fileToRead);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()){

            stringBuilder.append(scanner.nextLine() + "\n");
        }

        return stringBuilder.toString();
    }
}