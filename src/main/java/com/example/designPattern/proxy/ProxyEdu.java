package com.example.designPattern.proxy;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.proxy
 * @className Proxy
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-25 09:05
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 代理设计模式:为其他对象提供一种代理以控制对这个对象的访问 这个案例属于静态代理
 */
public interface ProxyEdu {
}

/**
 * 代理接口
 */
interface GiveGift{

    void giveDolls();

    void giveFlowers();

    void giveChocolate();
}

/**
 * 目标对象
 */
@Data
@AllArgsConstructor
class SchoolGirl{

    private String name;

}

/**
 * 追求者类 实现送礼物接口
 */
class Pursuit implements GiveGift{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolGirl getMm() {
        return mm;
    }

    public void setMm(SchoolGirl mm) {
        this.mm = mm;
    }

    SchoolGirl mm;

    public Pursuit(String name,SchoolGirl mm) {
        this.mm = mm;
        this.name = name;
    }

    @Override
    public void giveDolls() {
        System.out.println("送" + mm.getName() + "洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送"+ mm.getName() + "花花");

    }

    @Override
    public void giveChocolate() {
        System.out.println("送"+ mm.getName() + "巧克力");

    }
}

/**
 * 代理类 实现送礼物接口
 */
class Proxy implements GiveGift{

    Pursuit gg;

    public Proxy(Pursuit gg,SchoolGirl mm){

        this.gg = new Pursuit(gg.getName(),mm);

    }

    @Override
    public void giveDolls() {
        System.out.print(gg.getName());
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        System.out.print(gg.getName());
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        System.out.print(gg.getName());
        gg.giveChocolate();
    }
}

class Main{
    public static void main(String[] args) {
        //被追求者mm
        SchoolGirl wxn = new SchoolGirl("wxn");
        //追求者leon
        Pursuit leon = new Pursuit("Leon",wxn);

        //创建代理对象 由代理对象去追求mm
        Proxy proxy = new Proxy(leon,wxn);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}