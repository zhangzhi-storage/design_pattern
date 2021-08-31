package com.yunxi.stragegy;

/**
 * 创建接口的实现类
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
