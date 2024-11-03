package org.sda;

import org.sda.daos.GenericDao;
import org.sda.models.Location;
import org.sda.models.WeatherData;
import org.sda.services.GenericService;

import java.util.Date;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        GenericDao<Location, Long> locationDao = new GenericDao<>(Location.class);
        GenericService<Location, Long> locationService = new GenericService<>(locationDao);

        GenericDao<WeatherData, Long> weatherDataDao = new GenericDao<>(WeatherData.class);
        GenericService<WeatherData, Long> weatherService = new GenericService<>(weatherDataDao);

        Date date = new Date();

        WeatherData weatherData1 = new WeatherData(date, 23.4, 1012D, 30D, 7D, "SE");
        WeatherData weatherData2 = new WeatherData(date, 18.6, 998D, 30D, 5D, "N");

        weatherService.save(weatherData1);
        weatherService.save(weatherData2);

        Location location1 = new Location("Prague", 14.42076, 50.08804, "Czech");
        Location location2 = new Location("Liberec", 15.05619, 50.76711, "Czech");

        locationService.save(location1);
        System.out.println();

        location1.setWeather(weatherData1);

        locationService.update(location1);
        weatherService.update(weatherData1);
    }
}
