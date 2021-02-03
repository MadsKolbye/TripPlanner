package com.company;

public class BeachTrip extends Trip {
    int temperature;
    public BeachTrip(String country, String language, int duration, int amountOfPeople, int temperature) {
        super(country, language, duration, amountOfPeople);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "temperature=" + temperature +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", duration=" + duration +
                ", amountOfPeople=" + amountOfPeople +
                '}';
    }
}
