package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

    @Test
    void localeUsa() {
        String greeting = localizationService.locale(Country.USA);
        assertEquals("Welcome", greeting);
    }

    @Test
    void localeRussia() {
        String greeting = localizationService.locale(Country.RUSSIA);
        assertEquals("Добро пожаловать", greeting);
    }

    @Test
    void localeDefault() {
        String greeting = localizationService.locale(Country.GERMANY);
        assertEquals("Welcome", greeting);
    }

}