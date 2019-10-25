package com.example.designPattern.Decorator;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.strategy
 * @className Decorator
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-24 20:10
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

/**
 * 装饰设计模式:动态地给一个对象增加一些额外的职责。
 *
 */
public interface DecoratorAble {
}

// 对象接口 给这些对象动态地增加职责
interface Component{

    void Operation();

}


//一个具体的对象
class ConcreteComponent implements  Component{

    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}


 abstract class  Decorator implements  Component{

    protected Component component;

    //设置Component
    public void setComponent(Component component) {
        this.component = component;
    }

    //重现operation() 实际执行的是成员变量component的operation
    @Override
    public void Operation() {
        if (null != component){
            component.Operation();
        }
    }
}


class ConcreteDecoratorA extends Decorator{

    //本类的独有功能，已区别于ConcreteDecoratorB
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
    }
}

class Main1{
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}