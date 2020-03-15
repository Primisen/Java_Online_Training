package com.primisen.programming_with_class.composition.Task1;

public class Sentence {

    private Word [] words;

    public Sentence() {
    }

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }
}
