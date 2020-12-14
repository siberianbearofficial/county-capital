package com.company;

import java.util.Scanner;

public class Answer {

    public Answer (City A, Country B) { this.A = A; this.B = B; }

    public Answer (Country B) { this.B = B; }

    public Answer (City A) { this.A = A; }

    private City A;
    private Country B;

    protected void getBoolAnswer () {
        boolean userAnswer;
        String input = cin();
        if (input.charAt(0) == 'y' || input.charAt(0) == 'д') userAnswer = true; else if (input.charAt(0) == 'n' || input.charAt(0) == 'н') userAnswer = false; else {
            System.out.println("Error!");
            return;
        }
        boolean rightAnswer = A.isCapitalOf(B);
        printAnswer(rightAnswer == userAnswer);
    }

    protected void getBAnswer () {
        City A = new City(B.findCapital());
        printAnswer(cin().equals(A.cityName.toLowerCase().replaceAll(" ", "")));
    }

    protected void getAAnswer () {
        String input = cin();
        Country B = new Country(input.substring(0, 1).toUpperCase() + input.substring(1));
        printAnswer(A.isCapitalOf(B));
    }

    private void printAnswer (boolean status) {
        if (status) Main.stats++; else Main.stats--;
        System.out.println(status ? "Совершенно верно!" : "К сожалению, это неправильный ответ :(");
    }

    private String cin () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase().replaceAll(" ", "");
    }
}