package com.lcl.第十二章.复合模式.视图_模型_控制器;

public interface HeartModelInterface {
    Integer getHeartRate();

    void registerObserver(BeatObserver observer);

    void removeObserver(BeatObserver observer);

    void registerObserver(BPMObserver observer);

    void removeObserver(BPMObserver observer);
}
