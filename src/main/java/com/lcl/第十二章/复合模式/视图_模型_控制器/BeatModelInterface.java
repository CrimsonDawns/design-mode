package com.lcl.第十二章.复合模式.视图_模型_控制器;

public interface BeatModelInterface {
    //初始化函数
    void initialize();

    //节拍产生器打开
    void on();

    //节拍产生器关闭
    void off();

    //设置BPM
    void setBPM(Integer bpm);

    Integer getBPM();

    /// 观察者模式注册观察者和删除方法
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
