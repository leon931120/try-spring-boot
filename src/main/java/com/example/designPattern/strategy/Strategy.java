package com.example.designPattern.strategy;

/**
 * @projectName try-spring-boot
 * @packageName com.example.designPattern.strategy
 * @className Strategy
 * @author： liuwei
 * @version： 1.0
 * @since： 2019-10-24 17:52
 * <p>Description: ${DESCRIPTION} </p>
 * <p>Copyright: Copyright (C) 2012-2019</p>
 * <p>Company: Beijing GS Technology Co., Ltd</p>
 */

/**
 * 策略设计模式
 * 算法接口
 */
public interface Strategy {

    //算法接口
    void AlgorithmInterface();

}

class ConcreteStrategyA implements Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A");
    }
}

class ConcreteStrategyB implements Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B");
    }
}

class ConcreteStrategyC implements Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C");
    }
}

// 上下文
class Context{

    Strategy strategy;

    //初始化时，传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        // 根据具体的策略对象，调用其算法的方法
        strategy.AlgorithmInterface();;

    }
}

class main{

    public static void main(String[] args) {

        //由于实例化不同的策略，所以最终在调用context.ContextInterface()时，所获得的结果就不尽相同
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
