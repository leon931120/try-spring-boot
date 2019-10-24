package com.example.designPattern.observer;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.observer
 * @className Observer
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 09:54
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public interface Observer {
    /*
     * 观察者设计模式 定义观察者接口
     */
    void notify(String notice);
}
