package com.atguigu.chain;

/**
 * 责任链抽象处理者
 */
public  class Teacher {
    private String name;
    private Teacher next;//下一个处理的老师:1.链条的引用点
    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }


    public void setNext(Teacher next){
        this.next=next;
    }

    public Teacher getNext() {
        return next;
    }

     void handleRequest(){
         System.out.println(this+"正在处理....");
         //2.下一个继续
         if(next!=null){
             next.handleRequest();
         }

     };

}
