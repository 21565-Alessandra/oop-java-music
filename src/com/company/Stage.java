package com.company;

import java.util.ArrayList;

public class Stage {

    private ArrayList<Instruments> listOfInstruments = new ArrayList<Instruments>();


    public Stage() {
        MessageCentre.DebugMessage("Creating a Stage");
    }

    public void StringInstruments(Instruments instrumentsOnStage) {
        listOfInstruments.add(instrumentsOnStage);
    }

    public Double CalculateTotalTickets() {
        Double tickets = 10.00;
        Double totalTickets = 0.0;

        for(Instruments currentGuitar:listOfInstruments) {
            MessageCentre.DebugMessage(String.format("Calculating for %s : %s",currentGuitar.getBrand(), currentGuitar.getModelType()));
            totalTickets += tickets;

        }

        return totalTickets;
    }

    @Override
    public String toString() {

        return String.format("The stage has %d sits and the total tickets per day are: %f", listOfInstruments.size(), CalculateTotalTickets());
    }
}

