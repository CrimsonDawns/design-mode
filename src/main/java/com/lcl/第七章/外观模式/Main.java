package com.lcl.第七章.外观模式;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner("Top-O-Line Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade htf = new HomeTheaterFacade(amp,
                cd, dvd, popper, projector, screen, lights, tuner);

        htf.watchMovie("Raiders of the Lost Ark");
        htf.endMovie();
    }
}

