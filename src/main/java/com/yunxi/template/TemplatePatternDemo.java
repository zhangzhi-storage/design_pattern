package com.yunxi.template;

/**
 * spring框架数据源 C3PO hirka 抽取的大部分类管理数据库链接，开始事务，回滚事务
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new Basketball();
        game.play();
        System.out.println();
        game=new Football();
        game.play();
    }
}