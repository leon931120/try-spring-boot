package com.example.designPattern.template;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.template
 * @className TemplateInt
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-27 10:29
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

/**
 * 模板方法模式:定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义
 */
public interface TemplateInt {
}

/**
 * 抽象模板
 */
abstract class AbstractClass{

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void TemplateMethod(){

        primitiveOperation1();
        primitiveOperation2();
        System.out.println("---");
    }
}

class ConcreteClassA extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("classA 的 方法一具体实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("classA 的 方法二具体实现");
    }
}


class ConcreteClassB extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("classB 的 方法二具体实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("classB 的 方法二具体实现");
    }
}

class Main{
    // 通过把不变行为搬移到超类，去除子类中的重复代码
    public static void main(String[] args) {
        AbstractClass c ;

        c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}