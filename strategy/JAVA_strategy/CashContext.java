/***********************************************************************
 * Module:  CashContext.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashContext
 ***********************************************************************/

import java.util.*;

public class CashContext {
   private CashSuper cs;
   
   public CashSuper cashSuper;
   
   /** 根据收费策略的不同获得计算结果
    * 
    * @param money */
   public double getResult(double money) {
      // TODO: implement
      return cashSuper.acceptCash(money);
   }
   
   /** 通过构造方法传入具体的策略类
    * 
    * @param csSuper */
   public CashContext(CashSuper csSuper) {
      // TODO: implement
	   this.cashSuper = csSuper;
   }
   

}