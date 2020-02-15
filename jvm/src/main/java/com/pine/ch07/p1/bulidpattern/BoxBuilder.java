package com.pine.ch07.p1.bulidpattern;


/**
 *类说明：抽象建造者
 */
public interface  BoxBuilder {
      void buildName(String Name);
      void buildPrice(int Price);
      void buildzz(int zz);
      void buildxyd(int xyd);
      Box createBox();
}
