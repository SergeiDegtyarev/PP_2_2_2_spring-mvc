package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String modelCar;

    private String colorCar;

    private int carSeries;

    public Car(String modelCar, String colorCar, int carSeries) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.carSeries = carSeries;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }
}
