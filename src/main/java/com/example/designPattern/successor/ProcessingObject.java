package com.example.designPattern.successor;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.successor
 * @className ProcessingObject
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-15 10:27
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
/*
  责任链设计模式
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor){
        this.successor = successor;
    }

    /*
        handle 方法提供了如何进行工作处理的框架
     */
    public T handle(T input){
        T r = handleWork(input);
        if (successor != null){
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
