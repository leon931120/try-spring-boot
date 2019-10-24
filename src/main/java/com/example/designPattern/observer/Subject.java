package com.example.designPattern.observer;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.observer
 * @className Subject
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 09:58
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

public interface Subject {

    void register(Observer o);

    void noticeAllObserver(String msg);
}
