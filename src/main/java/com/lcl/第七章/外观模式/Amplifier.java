package com.lcl.第七章.外观模式;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Top-O-Line Amplifier setting CD player to " + cdPlayer);
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Top-O-Line Amplifier setting DVD player to " + dvdPlayer);
    }

    public void setStereoSound() {
        System.out.println("Top-O-Line Amplifier stereo sound on");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Top-O-Line Amplifier setting tuner to " + tuner);
    }

    public void setVolume(int level) {
        System.out.println("Top-O-Line Amplifier setting volume to " + level);
    }

    @Override
    public String toString() {
        return "Top-O-Line Amplifier";
    }
}
