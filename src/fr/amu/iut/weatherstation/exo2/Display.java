package fr.amu.iut.weatherstation.exo2;

import fr.amu.iut.weatherstation.exo1.HumiditySensor;
import fr.amu.iut.weatherstation.exo1.PressureSensor;
import fr.amu.iut.weatherstation.exo1.TemperatureSensor;
import fr.amu.iut.weatherstation.exo1.WeatherStation;

public abstract class Display {

    private String name;
    //private WeatherStation station;
    private float temperature;
    private float humidity;
    private float pressure;

    public Display() {
        //this.station = new WeatherStation(new TemperatureSensor(), new HumiditySensor(), new PressureSensor());
    }

    public Display(String name, WeatherStation station) {
        this.name = name;
        //this.station = station;
    }

    public void update(float temp, float hum, float pres) {
        temperature = temp;
        humidity = hum;
        pressure = pres;
    }

    public void print() {
        System.out.println();
        System.out.println(name+": polling sensors");
        // Take a measurement from the sensors
        //station.pollSensors();
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    public String getName() {
        return name;
    }
}
