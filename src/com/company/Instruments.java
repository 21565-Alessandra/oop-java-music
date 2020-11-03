package com.company;

public abstract class Instruments {

    private String brand;
    private String modelType;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public abstract void Move(int time, String band);


}



