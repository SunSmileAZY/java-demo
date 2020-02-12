package com.pine.ch05.memleak;

/**
 * @author 【享学课堂】 King老师
 */
public class NoStaticInternal {
    /**
     * @param args
     */
    public  int k=13;
    private static String string="King";
    protected float j=1.5f;
    public static void show(){
        System.out.println("show");
    }
    private void add(){
        System.out.println("add");
    }
    public static void main(String[] args) {
        NoStaticInternal m=new NoStaticInternal();
        //非静态内部类的构造方式
        //Child c=m.new Child();
        Child c= new Child();
        c.test();
    }
    //内部类Child --静态的，防止内存泄漏
    static  class Child{
        public int i;
        public void test(){
            //System.out.println("k=:"+k);
            System.out.println("string:"+string);
            //add();
            //System.out.println("j=:"+j);
            show();
        }

    }
}
