package com.example.designPattern.strategy;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.strategy
 * @className CashSuper
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-24 18:00
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

/**
 * 抽象策略
 */
public interface CashSuper {

    double doStrategy(double money);
}

/**
 * 正常收费
 */
class CashNormal implements CashSuper{

    @Override
    public double doStrategy(double money) {
            return money;
    }
}

/**
 * 打折收费
 */
class CashRebate implements CashSuper{

    private String rate;

    public CashRebate(String rate) {
        this.rate = rate;
    }

    @Override
    public double doStrategy(double money) {
        double v = money * Double.parseDouble(rate);
        return v;
    }
}

/**
 * 返利收费子类
 */
class CashReturn implements CashSuper{

    //例如 满 300  返 100 , moneyCondition = 300  moneyReturn = 100
    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double doStrategy(double money) {
        double result = money;
        if (money >= moneyCondition){

            //消费金额超过返利条件
            result =money - Math.floor(money / moneyCondition) * moneyReturn;

        }
        return result;
    }
}

/**
 * 策略上下文
 */
class StragegyContext{

    CashSuper cashSuper;

    public StragegyContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getAcceptMoney(double money){
        return cashSuper.doStrategy(money);
    }
}

// 客户端
class Main{

    public static void main(String[] args) {


        //无活动
        StragegyContext stragegyContext = new StragegyContext(new CashNormal());
        System.out.println("无活动消费200应收金额"+stragegyContext.getAcceptMoney(200d));


        //打折
        StragegyContext stragegyContext1 = new StragegyContext(new CashRebate("0.8"));
        System.out.println("打0.8折活动消费200应收金额"+stragegyContext1.getAcceptMoney(200d));


        //满返
        StragegyContext stragegyContext2 = new StragegyContext(new CashReturn(300, 100));
        System.out.println("满300返100消费500应收金额" + stragegyContext2.getAcceptMoney(500));

    }
}