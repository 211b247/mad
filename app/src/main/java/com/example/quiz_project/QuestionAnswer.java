package com.example.quiz_project;

public class QuestionAnswer {

    public static String question[] = {
            "Which company owns the android?",
            "which one is not the programming language",
            "where you are watching video"
    };

    public static String choices[][] = {
            {"Google", "Apple", "Nokia", "Samsung"},
            {"Java", "Kotlin", "Notepad", "Python"},
            {"Facebook", "Whatsapp", "Instagram", "Youtube"}
    };

    public static String correctAnswers[] = {
            "Google",
            "Notepad",
            "Youtube"
    };

    public void QuestionAnswer() {
      int length = question.length;

       if (question.length == choices.length || correctAnswers.length == length) {
            throw new IllegalArgumentException("All arrays must have the same length.");
       }
    }
}

