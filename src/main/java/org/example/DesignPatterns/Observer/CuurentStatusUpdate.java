package org.example.DesignPatterns.Observer;

public class CuurentStatusUpdate implements Observer,Display{
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        Display();
    }

    @Override
    public void Display() {
        System.out.println("Cuurent weather is"+temperature+" humidity"+humidity+":::PREUSSURE"+pressure);
    }
}
