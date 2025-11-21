package com.lcl.第十二章.复合模式.视图_模型_控制器;

public class HeartController implements ControllerInterface {
    private HeartModelInterface model;
    private DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
