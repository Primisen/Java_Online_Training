package com.primisen.programming_with_class.composition.Task1;

public class Text {

    private Sentence header;
    private Sentence[] sentences;

    public Text() {
    }

    public Text(Sentence header, Sentence[] sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public Sentence getHeader() {
        return header;
    }

    public void setHeader(Sentence header) {
        this.header = header;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public void print() {

        System.out.println(this.sentences);
    }

    public void printHeader() {
        System.out.println(this.header);
    }

    public void append(Sentence sentence) {
        int oldLength = this.sentences.length;

        Sentence [] newSentences = new Sentence[oldLength + 1];

        for (int i = 0; i < oldLength; i++) {

            newSentences[i] = this.sentences[i];
        }
        newSentences[oldLength] = sentence;

        this.sentences = newSentences;
    }

    public void append(Sentence[] sentences) {

        for (int i = 0; i < sentences.length; i++) {
            this.append(sentences[i]);
        }
    }
}
