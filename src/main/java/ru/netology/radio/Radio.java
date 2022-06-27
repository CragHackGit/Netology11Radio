package ru.netology.radio;

public class Radio {
    private int currentRadiostationNumber;
    private int currentVolume;
    private int maxStation = 9;
    private int maxVolume = 100;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > maxStation) {
            return;
        }
        if (currentRadiostationNumber < 0) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    void nextRadiostation() {
        if (currentRadiostationNumber == maxStation) {
            this.currentRadiostationNumber = 0;
            return;
        }
        this.currentRadiostationNumber += 1;
    }

    void prevRadiostation() {
        if (currentRadiostationNumber == 0) {
            this.currentRadiostationNumber = maxStation;
            return;
        }
        this.currentRadiostationNumber -= 1;
    }

    int getCurrentVolume() {
        return currentVolume;
    }

    void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume += 1;
        }
    }

    void decreaseVolume() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume -= 1;
        }
    }
}
