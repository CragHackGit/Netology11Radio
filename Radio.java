public class Radio {
    public int currentRadiostationNumber;
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1
        }
    }

    public void nextRadiostation() {
        if (currentRadiostationNumber = 9) {
            currentRadiostationNumber = 0
        } else {
            currentRadiostationNumber += 1
        }
    }

    public void prevRadiostation() {
        if (currentRadiostationNumber = 0) {
            currentRadiostationNumber = 9
        } else {
            currentRadiostationNumber -= 1
        }
    }
}
