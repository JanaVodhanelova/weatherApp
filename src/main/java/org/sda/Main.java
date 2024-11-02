package org.sda;

import org.sda.daos.GenericDao;
import org.sda.models.Location;
import org.sda.services.GenericService;

public class Main {
    public static void main(String[] args) {
        GenericDao<Location, Long> locationDao = new GenericDao<>(Location.class);
        GenericService<Location, Long> locationService = new GenericService<>(locationDao);

        Location location1 = new Location("Prague", 14.42076, 50.08804, "Czech");

        locationService.save(location1);
        System.out.println();
    }
}
