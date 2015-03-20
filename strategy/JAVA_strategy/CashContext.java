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
   
   /** 通过构造方 法，传入字符串，由创建时选择创建那个类
    * 
    * @param csSuper */
   public CashContext(String type) {
      // TODO: implement
	   switch(type)
	   {
	   case "正常":
		  this.cashSuper= new CashNormal();
		  break;
	   case "打八折":
		   this.cashSuper= new CashRebate("0.8");
		   break;
	   case "满300返100":
		   this.cashSuper= new CashReturn(300,100);
		   break;
	   }
   }
   

}