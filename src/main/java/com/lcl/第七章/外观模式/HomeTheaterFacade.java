package com.lcl.第七章.外观模式;

public class HomeTheaterFacade {
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    //将所有组件进行统一管理
    public HomeTheaterFacade(Amplifier amp,
                             CdPlayer cd,
                             DvdPlayer dvd,
                             PopcornPopper popper,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             Tuner tuner) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }

    //将启动电影一系列操作封装起来
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    //将关闭电影操作给封装起来
    public void endMovie() {
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
