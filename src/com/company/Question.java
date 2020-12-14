package com.company;

import java.util.Random;

public class Question {

    protected static void createRandomQuestion () {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0: createBoolQuestion(); break;
            case 1: createBQuestion(); break;
            case 2: createAQuestion(); break;
            default: System.out.println("Error");
        }
    }

    private static final Random random = new Random();

    private static void createBoolQuestion () {
        City A = City.getRandomCity();
        Country B = Country.getRandomCountry();
        print("Является ли город " + A.cityName + " столицей страны " + B.countryName + "?");
        Answer answer = new Answer(A, B);
        answer.getBoolAnswer();
    }

    private static void createBQuestion () {
        Country B = Country.getRandomCountry();
        print("Какая столица страны " + B.countryName + "?");
        Answer answer = new Answer(B);
        answer.getBAnswer();
    }

    private static void createAQuestion () {
        City A = City.getRandomCity();
        print("Столица какой страны город " + A.cityName + "?");
        Answer answer = new Answer(A);
        answer.getAAnswer();
    }

    private static void print (String s) {
        System.out.println(s);
    }
}
