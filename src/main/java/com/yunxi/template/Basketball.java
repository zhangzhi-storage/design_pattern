package com.yunxi.template;

public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball Game initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started .Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
