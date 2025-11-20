package com.lcl.第十二章.复合模式.视图_模型_控制器;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(Integer bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public Integer getBPM() {
        return bpm;
    }

    public void beatEvent() {
        notifyBPMObservers();
    }


    @Override
    void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }

    private void setUpMidi() {
    }

    private void buildTrackAndStart() {
    }

    private void notifyBPMObservers() {
    }
}
