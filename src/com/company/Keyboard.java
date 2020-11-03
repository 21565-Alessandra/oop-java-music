package com.company;

public class Keyboard extends Piano {

    public Keyboard() {

        MessageCentre.DebugMessage("Getting a Keyboard");
    }


    @Override
    public String toString() {

        return String.format("keyboard");
    }

    @Override
    public void Move(int time, String band) {

        MessageCentre.DebugMessage(String.format("I am playing %b %t times per day", band, time));
    }
}


