package com.example.Devices;

public class TV {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }

    public void changeVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
