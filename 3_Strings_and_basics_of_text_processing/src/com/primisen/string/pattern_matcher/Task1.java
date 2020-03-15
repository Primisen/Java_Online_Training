package com.primisen.string.pattern_matcher;

/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {

        //\u2029 - метасимвол разделения обзацев
        String text = "JVM is an abstract machine. It is called a virtual machine because it doesn't " +
                "physically exist. It is a specification that provides a runtime environment in which Java bytecode can be " +
                "executed. It can also run those programs which are written in other languages and compiled to Java bytecode.\n\r" +
                "" +
                "JVMs are available for many hardware and software platforms. JVM, JRE, and JDK are platform dependent because " +
                "the configuration of each OS is different from each other. However, Java is platform independent. There are " +
                "three notions of the JVM: specification, implementation, and instance. My new 5 sentence.\n\r" +
                "" +
                "The JVM performs the following main tasks: Loads code, verifies code, executes code, provides runtime environment. ";


        //part 1
        System.out.println("Part 1");
        printStringArray(sortingParagraphsOnNumberOfSentences(text));

        System.out.println();

        //part2
        System.out.println("Part 2");
        printStringArray(sortingSentencesOnLengthOfWords(text));

        System.out.println();

        //part3
        System.out.println("Part 3");
        char character = 'a';
        printStringArray(sortingLexemesInSentencesOnNumberOfCharacter(text, character));

    }

    private static String[] getParagraphs(String text) {

        String patternStr = "(^.*\\S+.*$)+";//что это
        Pattern pattern = Pattern.compile(patternStr, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);

        String separateParagraph = "dgu78ry4h9r3ew"; //то сочение, которое наименеее вероятно встретиться в тексте
        StringBuilder paragraphsString = new StringBuilder();

        while (matcher.find()) {

            paragraphsString.append(matcher.group() + separateParagraph);
        }

        String[] paragraphs = paragraphsString.toString().split(separateParagraph);

        return paragraphs;
    }

    private static String[] getSentences(String text) {

        Matcher matcher = matcherForSentences(text);

        String separator = "fhqaeuty58gjkr35fdjg907";

        StringBuilder stringSentences = new StringBuilder();
        while (matcher.find()) {

            stringSentences.append(matcher.group() + separator);
        }

        String[] sentences = stringSentences.toString().split(separator);

        return sentences;
    }

    private static String[] getWords(String sentence) {

//        String patternStr = ".*[^(. )(? )(! )]";
        String patternStr = "[^\\p{Punct}\\s]+"; //\p{Punct} matches any punctuation character

        Pattern pattern = Pattern.compile(patternStr, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(sentence);

        StringBuilder wordsString = new StringBuilder();
        while (matcher.find()) {

            wordsString.append(matcher.group() + " ");
        }

        String[] words = wordsString.toString().split("\\s");

        return words;
    }

    private static String[] sortingParagraphsOnNumberOfSentences(String text) {

        String[] paragraphs = getParagraphs(text);

        int[] sentenceNumberInParagraph = new int[paragraphs.length];

        for (int i = 0; i < paragraphs.length; i++) {

            Matcher matcher = matcherForSentences(paragraphs[i]);

            while (matcher.find()) {
                sentenceNumberInParagraph[i]++;
            }
        }

        return insertSort(sentenceNumberInParagraph, paragraphs);
    }

    private static String[] sortingSentencesOnLengthOfWords(String text) {

        String[] sentences = getSentences(text);

        for (int i = 0; i < sentences.length; i++) {

            String[] words = getWords(sentences[i]);

            int[] lengthOfWords = new int[words.length];

            for (int j = 0; j < words.length; j++) {
                lengthOfWords[j] = words[j].length();
            }

            words = insertSort(lengthOfWords, words);

            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < words.length; j++) {

                stringBuilder.append(words[j] + " ");
            }

            sentences[i] = stringBuilder.toString();
        }

        return sentences;
    }

    private static String[] sortingLexemesInSentencesOnNumberOfCharacter(String text, char character) {

        String[] sentences = getSentences(text);

        for (int i = 0; i < sentences.length; i++) {

            String[] words = getWords(sentences[i]);

            int[] numberOfCharacterInWord = new int[words.length];

            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < words[j].length(); k++) {

                    if (words[j].charAt(k) == character) {

                        numberOfCharacterInWord[j]++;
                    }
                }
            }

            words = insertSort(numberOfCharacterInWord, words);

            int index = 0;
            while (words[index].indexOf(character) != -1 && index < words.length - 1) {
                index++;
            }

            int newLength = words.length - index;

            int copyIndex = index;

            String[] newString = new String[newLength];
            for (int j = 0; j < newString.length; j++) {

                newString[j] = words[index];

                index++;
            }

            String[] newSortedString = alphabeticallySort(newString);
            for (int j = 0; j < newSortedString.length; j++) {
                words[copyIndex] = newSortedString[j];
                copyIndex++;
            }


            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < words.length; j++) {

                stringBuilder.append(words[j] + " ");
            }

            sentences[i] = stringBuilder.toString();

        }
        return sentences;
    }

    private static String[] insertSort(int[] numbers, String[] strings) {

        for (int i = 0; i < numbers.length; i++) {

            int indexOfMaxElement = i;

            for (int j = i; j < numbers.length; j++) {

                if (numbers[indexOfMaxElement] < numbers[j]) {

                    indexOfMaxElement = j;
                }
                if(numbers[indexOfMaxElement] == numbers[j]){

                    String [] array = {strings[indexOfMaxElement], strings[j]};
                    array = alphabeticallySort(array);

                    strings[indexOfMaxElement] = array[0];
                    strings[j] = array[1];
                }
            }

            if (indexOfMaxElement != i) {

                int bufInt = numbers[i];
                numbers[i] = numbers[indexOfMaxElement];
                numbers[indexOfMaxElement] = bufInt;

                String bufString = strings[i];
                strings[i] = strings[indexOfMaxElement];
                strings[indexOfMaxElement] = bufString;
            }
        }
        return strings;
    }

    private static String[] alphabeticallySort(String[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {

                    String buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
        return array;
    }

    private static Matcher matcherForSentences(String text) {

        String patternStr = "[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)"; //и что это

        Pattern pattern = Pattern.compile(patternStr, Pattern.MULTILINE);

        Matcher matcher = pattern.matcher(text);

        return matcher;
    }

    private static void printStringArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}