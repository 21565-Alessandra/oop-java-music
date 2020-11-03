package com.company;

public class Drum extends Instruments {

    public Drum() {

        MessageCentre.DebugMessage("Getting a drum");
    }

    @Override
    public String toString() {

        return String.format("drum");
    }

    @Override
    public void Move(int time, String band) {

        MessageCentre.DebugMessage(String.format("I am playing %b %t times per day", band, time));
    }
}
