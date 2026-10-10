package org.example.DesignPatterns.Observer;

public class AverageStatsDisplay implements Observer,Display{
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
            System.out.println("Avergae weather is"+temperature+" humidity"+humidity+":::PREUSSURE"+pressure);

    }
}
