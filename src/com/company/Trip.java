package com.company;

public class Trip {
    String country;
    String language;
    int duration;
    int amountOfPeople;

    public Trip (String country, String language, int duration, int amountOfPeople) {
        this.country = country;
        this.language = language;
        this.duration = duration;
        this.amountOfPeople = amountOfPeople;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", duration=" + duration +
                ", amountOfPeople=" + amountOfPeople +
                '}';
    }
}
