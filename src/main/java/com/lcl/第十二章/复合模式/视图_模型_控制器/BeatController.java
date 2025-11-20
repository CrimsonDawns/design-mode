package com.lcl.第十二章.复合模式.视图_模型_控制器;

public class BeatController implements ControllerInterface {
    private DJView view;
    private BeatModelInterface model;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

    @Override
    public void increaseBPM() {
        Integer bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        Integer bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }
}
