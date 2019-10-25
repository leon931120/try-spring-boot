package com.example.designPattern.Decorator;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.Decorator
 * @className Person
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-24 20:32
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */
//定义对象
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装饰的"+name);
    }
}

//定义服装类
class Finery extends Person{

    protected Person component;

    public void decorate(Person component){

        this.component = component;

    }

    @Override
    public void show() {
        if (null != component){
            component.show();
        }
    }
}

//具体服装类
class Jeans extends Finery{
    @Override
    public void show() {
        System.out.println("穿上牛仔裤");
        super.show();
    }
}

class TShirt extends Finery{
    @Override
    public void show() {
        System.out.println("穿上T恤");
        super.show();
    }
}

class Main{
    public static void main(String[] args) {

        Person leon = new Person("Leon");
        Jeans jeans = new Jeans();
        TShirt tShirt = new TShirt();

        jeans.decorate(leon);
        tShirt.decorate(jeans);

        tShirt.show();

    }
}
