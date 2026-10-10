package org.example.DesignPatterns.Observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        weatherData.SetMeasurements(30.5f,50.6f,90.0f);
        weatherData.registerObserver(new ForcastDisplay());
        ForcastDisplay forcastDisplay=new ForcastDisplay();
        AverageStatsDisplay averageStatsDisplay=new AverageStatsDisplay();
        CuurentStatusUpdate cuurentStatusUpdate=new CuurentStatusUpdate();
        weatherData.SetMeasurements(40.5f,60.6f,100.0f);
        weatherData.registerObserver(averageStatsDisplay);
        weatherData.registerObserver(cuurentStatusUpdate);
        weatherData.registerObserver(forcastDisplay);
        weatherData.removeObserver(forcastDisplay);
        weatherData.SetMeasurements(40.5f,60.6f,100.0f);

    }
}
