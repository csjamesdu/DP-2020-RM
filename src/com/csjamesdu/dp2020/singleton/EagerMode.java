package com.csjamesdu.dp2020.singleton;

public class EagerMode {

    public static final EagerMode INSTANCE = new EagerMode();
    private EagerMode () {}

    public static EagerMode getInstance(){
        return INSTANCE;
    }
}
