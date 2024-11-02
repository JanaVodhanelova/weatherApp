package org.sda.models;

import javax.persistence.*;

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

    public Location(String name, double latitude, double longitude, String string) {

        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.state = string;
    }

    public Location() {
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
