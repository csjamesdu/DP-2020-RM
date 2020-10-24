package com.csjamesdu.dp2020.singleton;

public class LazyModeTSafe {

    private static volatile LazyModeTSafe INSTANCE;

    private LazyModeTSafe(){
    }

    public static LazyModeTSafe getInstance() {
        if(INSTANCE == null){
            synchronized (LazyModeTSafe.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyModeTSafe();
                }
            }
        }
        return INSTANCE;
    }
}
