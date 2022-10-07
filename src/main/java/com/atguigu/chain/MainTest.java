package com.atguigu.chain;

/**
 * //1.链条的引用点
 * //2.下一个继续
 * //3.构造链条
 *
 * 回旋责任链
 * Filter 1  --   2   --- 3 ---  本人   --3 -- 2 --1
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher leifengyang = new Teacher("Leifengyang");
        Teacher xiaohui = new Teacher("xiaohui");
        Teacher mengmeng = new Teacher("mengmeng");
        //3.构造链条
        leifengyang.setNext(xiaohui);
        xiaohui.setNext(mengmeng);

        leifengyang.handleRequest();
    }
}
