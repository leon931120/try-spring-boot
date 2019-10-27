package com.example.designPattern.builder;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.builder
 * @className builder
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-27 14:05
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式是在当创建复杂对象的算法 应该独立于该对象的组成部分以及他们的装配方法时所使用的模式
 */
public class builder {
}


/**
 * 产品类，由多个部件组成
 */
class Product {

    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建 ---");
        parts.forEach(System.out::println);
    }
}

/**
 * 抽象建造者类 确定产品由两个部件partA和partB组成，声明一个得到产品建造后结果的方法
 */
abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();

}

/**
 * 具体建造者类1
 */
class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}


/**
 * 具体建造者类2
 */
class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

/**
 * 指挥者类 用来指挥建造过程
 */
class Director{

    public void Construct(Builder builder){

        builder.buildPartA();
        builder.buildPartB();

    }
}

class Main{
    public static void main(String[] args) {
        //创建指挥者
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}