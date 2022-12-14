package ru.netology.radioService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RadioStation.csv")
    public void shouldSetRadioStation(int currentRadioStation, int expected) {

        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Volume.csv")
    public void shouldSetVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "4,5",
            "9,0"
    })
    public void shouldNextRadioStation(int currentRadioStation, int expected) {

        radio.setCurrentRadioStation(currentRadioStation);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "5,4",
            "0,9"
    })
    public void shouldPrevRadioStation(int currentRadioStation, int expected) {

        radio.setCurrentRadioStation(currentRadioStation);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "9,10",
            "10,10"

    })
    public void shouldIncreaseVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,9",
            "1,0",
            "0,0"

    })
    public void shouldReduceVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
