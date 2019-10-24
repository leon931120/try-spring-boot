package com.example.designPattern.observer;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.observer
 * @className main
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 10:01
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
public class main {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.register(new SpeakerOne());
        feed.register(new SpeakerTwo());
        feed.register(new SpeakerThree());

        feed.noticeAllObserver("haha");
    }
}
