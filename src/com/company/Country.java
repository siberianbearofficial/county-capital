package com.company;

import java.util.Random;

public class Country extends CountryList {

    public Country (String name) { this.countryName = name; }

    private static final Random random = new Random();

    protected String countryName;

    protected static Country getRandomCountry () {
        String[][] list = getListOfCountries();
        int rand = random.nextInt(countOfCountries);
        return new Country(list[0][rand]);
    }

    protected String findCapital () {
        String[][] list = getListOfCountries();
        for (int i = 0; i < countOfCountries; i++) {
            if (list[0][i].equals(countryName)) {
                return list[1][i];
            }
        }
        return "Error";
    }

    protected boolean isCountry (String name) {
        String[][] list = getListOfCountries();
        for (int i = 0; i < countOfCountries; i++) {
            if (list[0][i].equals(name)) {
                return true;
            }
        }
        return false;
    }

}
