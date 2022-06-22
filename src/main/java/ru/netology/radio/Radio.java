package ru.netology.radio;

public class Radio {
    public int currentRadiostationNumber;
    public int currentVolume;

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > 9) {
            return;
        }
        if (currentRadiostationNumber < 0) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    public void nextRadiostation() {
        if (currentRadiostationNumber == 9) {
            this.currentRadiostationNumber = 0;
            return;
        }
        this.currentRadiostationNumber += 1;
    }

    public void prevRadiostation() {
        if (currentRadiostationNumber == 0) {
            this.currentRadiostationNumber = 9;
            return;
        }
        this.currentRadiostationNumber -= 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 10) {
            this.currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume -= 1;
        }
    }

}
