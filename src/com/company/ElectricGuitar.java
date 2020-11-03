package com.company;

public class ElectricGuitar extends Instruments {

    public ElectricGuitar() {

        MessageCentre.DebugMessage("Getting an ElectricGuitar");

        setBrand("Uknown brand");
        setModelType("Uknown model");


    }

    public ElectricGuitar(String brand, String modelType) {

        MessageCentre.DebugMessage("Getting a new ElectricGuitar from specific brand and type");

        setBrand(brand);
        setModelType(modelType);
    }

    @Override
    public String toString() {

        return String.format("ToString() => e2 brand: %s, modelType: %s", getBrand(), getModelType());
    }


    @Override
    public void Move(int time, String band) {

    }
}

