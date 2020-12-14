package com.company;

import java.util.Random;

public class City extends CountryList {

    public City(String gotName) { this.cityName = gotName; }

    protected String cityName;

    private static final Random random = new Random();

    protected static City getRandomCity () {
        String[][] list = getListOfCountries();
        int rand = random.nextInt(countOfCountries);
        return new City(list[1][rand]);
    }

    protected boolean isCity (String name) {
        String[][] list = getListOfCountries();
        for (int i = 0; i < countOfCountries; i++) {
            if (list[1][i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    protected boolean isCapitalOf(Country country) {
        return cityName.equals(country.findCapital());
    }

}
