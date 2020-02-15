package com.pine.ch07.p1;

/**
 * 建造者模式（简单版）
 */
public class BoxBuilder {
    //required必须参数
    private  final String Name;//礼盒名称
    private  final int Price;//礼盒价格
    //optional可选参数
    private   int zz;//粽子
    private   int xyd;//咸鸭蛋
    private   int ldg;//绿豆糕
    private   int yb;//月饼
    private   int jg;//坚果

    //具体建造者
    public static class Builder{
        //required必须参数
        private  final String Name;//礼盒名称
        private  final int Price;//礼盒价格
        //optional可选参数
        private   int zz;//粽子
        private   int xyd;//咸鸭蛋
        private   int ldg;//绿豆糕
        private   int yb;//月饼
        private   int jg;//坚果
        //构造方法
        public Builder(String name, int price) {
            super();
            this.Name = name;
            this.Price = price;
        }
        //建造方法
        public BoxBuilder builder(){
            return new BoxBuilder(this);
        }

        public Builder zz(int value){
            this.zz=value;
            return this;
        }
        public Builder xyd(int value){
            this.xyd=value;
            return this;
        }
        //......
    }
    private BoxBuilder (Builder builder){
        Name = builder.Name;
        Price =builder.Price;
        zz =builder.zz;
        xyd =builder.xyd;
        ldg=builder.ldg;
        yb=builder.yb;
        jg=builder.jg;
    }

    public static void main(String[] args) {
        BoxBuilder box1 = new Builder("端午节礼盒1",120)
                .zz(8)
                .xyd(4)
                .builder();

    }
}
