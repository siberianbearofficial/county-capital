package com.company;

public class Main {

    public static int stats = 0;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Добро пожаловать в игру Столицы! Отвечайте на вопросы, представленные ниже и зарабатывайте баллы. За каждый верный ответ можно получить 1 балл, а за каждый неверный потерять. Победа наступает при получении 100 баллов.");
        while (stats < 100) {
            Question.createRandomQuestion();
            System.out.println("Баллов сейчас: " + stats);
        }
        System.out.println("Поздравляем, это победа!");
    }
}
