package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    GeoServiceImpl geoService = new GeoServiceImpl();

    @Test
    void byIp() {
        Location location = geoService.byIp(GeoServiceImpl.LOCALHOST);
        assertNull(location.getCountry());
    }

    @Test
    void byNewUorkIp() {
        Location location = geoService.byIp(GeoServiceImpl.NEW_YORK_IP);
        assertEquals(Country.USA, location.getCountry());
    }

    @Test
    void byMoscowIp() {
        Location location = geoService.byIp(GeoServiceImpl.MOSCOW_IP);
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void byMoscowStratIp() {
        Location location = geoService.byIp("172.");
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void byNewYorkStartIp() {
        Location location = geoService.byIp("96.");
        assertEquals(Country.USA, location.getCountry());
    }
}