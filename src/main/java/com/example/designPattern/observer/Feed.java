package com.example.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.observer
 * @className Feed
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 09:59
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class Feed implements  Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void noticeAllObserver(String msg) {
        observers.forEach(p -> p.notify(msg));
    }
}
