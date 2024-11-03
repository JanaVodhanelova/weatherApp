package org.sda.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "weather")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "locations_id")
    private Location location;

    private Date date;

    private Double temperature;

    private Double pressure;

    private Double humidity;

    private Double windSpeed;

    private String windDirection;

    public WeatherData(Date date, Double temperature, Double pressure, Double humidity, Double windSpeed, String windDirection) {

        //this.location = location;
        this.date = date;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public WeatherData() {
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                //", location=" + location +
                ", date=" + date +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", windDirection='" + windDirection + '\'' +
                '}';
    }


}

