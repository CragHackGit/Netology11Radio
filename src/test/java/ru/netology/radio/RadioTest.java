package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldChangeOnZeroStationIfCurrentIsNine() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        radio.nextRadiostation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldChangeOnNineStationIfCurrentIsZero() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        radio.prevRadiostation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 1;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        radio.prevRadiostation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        radio.nextRadiostation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadiostationNumber(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadiostationNumber());
    }

    @Test
    void shouldNotSetVolumeOverMax() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setCurrentVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setCurrentVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeIncrease() {
        Radio radio = new Radio();
        int volume = 8;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int expected = 9;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeDecrease() {
        Radio radio = new Radio();
        int volume = 7;
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void shouldNotIncreaseIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

}