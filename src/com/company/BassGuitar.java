package com.company;

public class BassGuitar extends Bass {

    public BassGuitar() {
        MessageCentre.DebugMessage("Creating a Bass Guitar");

        setBrand("");
        setModelType("");
    }

    @Override
    public String toString() {

        return "This is a bass guitar";
    }

    @Override
    public void Move(int time, String band) {

    }
}




