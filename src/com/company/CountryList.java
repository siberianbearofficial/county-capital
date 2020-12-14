package com.company;

public class CountryList extends Consts {
    private static String[][] listOfCountries = new String[countOfCountries][countOfCountries];

    private static void setListOfCountries () {
        listOfCountries[0][0] = "Россия"; listOfCountries[1][0] = "Москва";
        listOfCountries[0][1] = "Сша"; listOfCountries[1][1] = "Вашингтон";
        listOfCountries[0][2] = "Германия"; listOfCountries[1][2] = "Берлин";
        listOfCountries[0][3] = "Италия"; listOfCountries[1][3] = "Рим";
        listOfCountries[0][4] = "Франция"; listOfCountries[1][4] = "Париж";
        listOfCountries[0][5] = "Румыния"; listOfCountries[1][5] = "Бухарест";
        listOfCountries[0][6] = "Мексика"; listOfCountries[1][6] = "Мехико";
        listOfCountries[0][7] = "Бразилия"; listOfCountries[1][7] = "Бразилиа";
        listOfCountries[0][8] = "Албания"; listOfCountries[1][8] = "Тирана";
        listOfCountries[0][9] = "Болгария"; listOfCountries[1][9] = "София";
        listOfCountries[0][10] = "Белоруссия"; listOfCountries[1][10] = "Минск";
        listOfCountries[0][11] = "Украина"; listOfCountries[1][11] = "Киев";
        listOfCountries[0][12] = "Великобритания"; listOfCountries[1][12] = "Лондон";
        listOfCountries[0][13] = "Греция"; listOfCountries[1][13] = "Афины";
        listOfCountries[0][14] = "Грузия"; listOfCountries[1][14] = "Тбилиси";
        listOfCountries[0][15] = "Швеция"; listOfCountries[1][15] = "Стокгольм";
        listOfCountries[0][16] = "Нидерланды"; listOfCountries[1][16] = "Амстердам";
        listOfCountries[0][17] = "Хорватия"; listOfCountries[1][17] = "Загреб";
        listOfCountries[0][18] = "Дания"; listOfCountries[1][18] = "Копенгаген";
        listOfCountries[0][19] = "Финляндия"; listOfCountries[1][19] = "Хельсинки";
    }

    protected static String[][] getListOfCountries() {
        setListOfCountries();
        return listOfCountries;
    }
}
