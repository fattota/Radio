package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;


    public Radio() {

    }

    public Radio(int numberOfRadioStations) {
        this.numberOfStations = numberOfRadioStations;
    }


    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public void switchToNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }
        currentStation = 0;

    }

    public void switchToPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        currentStation = 9;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public int getCurrentStation() {
        return currentStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}
