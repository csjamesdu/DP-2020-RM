package com.csjamesdu.dp2020.singleton;

public class LazyModeThreadUnsafe {

    private static LazyModeThreadUnsafe INSTANCE;
    private LazyModeThreadUnsafe(){}

    public static LazyModeThreadUnsafe getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new LazyModeThreadUnsafe();
        }
        return INSTANCE;
    }
}
