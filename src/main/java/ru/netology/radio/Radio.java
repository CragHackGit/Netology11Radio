package ru.netology.radio;

public class Radio {
    private int currentRadiostationNumber;
    private int currentVolume;

    int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > 9) {
            return;
        }
        if (currentRadiostationNumber < 0) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    void nextRadiostation() {
        if (currentRadiostationNumber == 9) {
            this.currentRadiostationNumber = 0;
            return;
        }
        this.currentRadiostationNumber += 1;
    }

    void prevRadiostation() {
        if (currentRadiostationNumber == 0) {
            this.currentRadiostationNumber = 9;
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
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    void increaseVolume() {
        if (currentVolume == 10) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 10) {
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
