package com.yunxi.stragegy;

/**
 * 支付选择不同的支付方式
 * 例如策略1 按照优惠金额大小排序
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));
        context=new Context(new OperationSubtract());
        System.out.println("10 - 5 ="+context.executeStrategy(10,5));
        context=new Context(new OperationMultiply());
        System.out.println("10 * 5 ="+context.executeStrategy(10,5));

    }
}
