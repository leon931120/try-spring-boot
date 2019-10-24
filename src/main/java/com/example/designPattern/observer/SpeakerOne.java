package com.example.designPattern.observer;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.observer
 * @className SpeakerOne
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 09:57
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
/*
    定义观察者
 */
public class SpeakerOne implements Observer {

    @Override
    public void notify(String notice) {
        System.out.println("i am speaker one , i get message "+ notice);
    }
}

class SpeakerTwo implements Observer{

    @Override
    public void notify(String notice) {
        System.out.println("i am speaker two , i get message "+ notice);
    }
}

class SpeakerThree implements Observer{

    @Override
    public void notify(String notice) {
        System.out.println("i am speaker three , i get message "+ notice);
    }
}
