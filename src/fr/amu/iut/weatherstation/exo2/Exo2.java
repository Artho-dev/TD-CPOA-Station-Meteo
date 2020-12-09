package fr.amu.iut.weatherstation.exo2;

import fr.amu.iut.weatherstation.exo1.HumiditySensor;
import fr.amu.iut.weatherstation.exo1.PressureSensor;
import fr.amu.iut.weatherstation.exo1.TemperatureSensor;
import fr.amu.iut.weatherstation.exo1.WeatherStation;

public class Exo2 {

    public static void main(String[] args) {
        // Initialize sensors
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        HumiditySensor humiditySensor = new HumiditySensor();
        PressureSensor pressureSensor = new PressureSensor();

        // Initialize our weather station by linking it to the sensors
        WeatherStation weatherStation1 = new WeatherStation(temperatureSensor, humiditySensor, pressureSensor);

        temperatureSensor = new TemperatureSensor();
        humiditySensor = new HumiditySensor();
        pressureSensor = new PressureSensor();

        // Initialize our weather station by linking it to the sensors
        WeatherStation weatherStation2 = new WeatherStation(temperatureSensor, humiditySensor, pressureSensor);

        temperatureSensor = new TemperatureSensor();
        humiditySensor = new HumiditySensor();
        pressureSensor = new PressureSensor();

        // Initialize our weather station by linking it to the sensors
        WeatherStation weatherStation3 = new WeatherStation(temperatureSensor, humiditySensor, pressureSensor);

        try {
            //noinspection InfiniteLoopStatement


            while (true){

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
