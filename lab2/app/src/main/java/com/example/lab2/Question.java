package com.example.lab2;

public class Question {
    private int title;
    private int text;
    private int answers_count;
    private int image;

    public Question(int title, int text, int answers_count, int image) {
        this.title = title;
        this.text = text;
        this.answers_count = answers_count;
        this.image = image;
    }

    public int getTitle() {
        return title;
    }

    public int getText() {
        return text;
    }

    public int getAnswers_count() {
        return answers_count;
    }

    public int getImage() {
        return image;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public void setText(int text) {
        this.text = text;
    }

    public void setAnswers_count(int answers_count) {
        this.answers_count = answers_count;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
