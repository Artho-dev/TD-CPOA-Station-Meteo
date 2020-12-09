package fr.amu.iut.weatherstation.exo1;

import fr.amu.iut.weatherstation.exo2.ConsoleDisplay;
import fr.amu.iut.weatherstation.exo2.Display;
import fr.amu.iut.weatherstation.exo2.KitchenDisplay;
import fr.amu.iut.weatherstation.exo2.SmartphoneDisplay;

import java.util.ArrayList;

public class WeatherStation {
    private TemperatureSensor temperatureSensor;
    private HumiditySensor humiditySensor;
    private PressureSensor pressureSensor;
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Display> displayList;


    public WeatherStation(TemperatureSensor temperatureSensor, HumiditySensor humiditySensor, PressureSensor pressureSensor){
        this.temperatureSensor = temperatureSensor;
        this.humiditySensor = humiditySensor;
        this.pressureSensor = pressureSensor;
        displayList.add(new ConsoleDisplay());
        displayList.add(new KitchenDisplay());
        displayList.add(new SmartphoneDisplay());
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }

    public void pollSensors(){

        // Ask each sensor for its value and store it
        if (temperature != temperatureSensor.takeMeasurement() ||
            humidity != humiditySensor.takeMeasurement() ||
            pressure != pressureSensor.takeMeasurement())
        {
            this.temperature = temperatureSensor.takeMeasurement();
            this.humidity = humiditySensor.takeMeasurement();
            this.pressure = pressureSensor.takeMeasurement();

            for (Display d: displayList) {
                d.update(temperature, humidity, pressure);
            }
        }
    }
}
