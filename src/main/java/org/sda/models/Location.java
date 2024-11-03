package org.sda.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double latitude;

    private double longitude;

    private String state;

    @OneToMany(mappedBy = "location")
    private List<WeatherData> weatherDatas = new ArrayList<>();


    public Location(String name, double latitude, double longitude, String string) {

        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.state = string;
    }

    public Location() {
    }

    public void setWeather(WeatherData weatherData){
        weatherDatas.add(weatherData);
        weatherData.setLocation(this);
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", string='" + state + '\'' +
                '}';
    }
}
