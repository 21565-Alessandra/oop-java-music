package com.company;

public class TestRun {

    public void Run() {

        RunObjects();
        RunStage();

    }

    public void RunStage() {
        Stage stage = new Stage();
        ElectricGuitar e1 = new ElectricGuitar();
        ElectricGuitar e2 = new ElectricGuitar("LesPaul", "Epiphone");
        ElectricGuitar e3 = new ElectricGuitar("Gibson", "Citation");

        stage.StringInstruments(e1);
        stage.StringInstruments(e2);
        stage.StringInstruments(e3);

        BassGuitar b1 = new BassGuitar();
        stage.StringInstruments(b1);

        MessageCentre.DebugMessage(stage.toString());


    }


    public void RunObjects() {



        ElectricGuitar e1 = new ElectricGuitar();

        ElectricGuitar e2 = new ElectricGuitar("LesPaul", "Gibson");

        MessageCentre.DebugMessage(e2.toString());

        BassGuitar b1 = new BassGuitar();

        System.out.println(b1.toString());

        UprightBass u1 = new UprightBass();

        Keyboard k1 = new Keyboard();
        k1.Move(5, "Elton John");

        Drum d1 = new Drum();

        d1.Move(10, "Led Zeppelin");


    }
}





