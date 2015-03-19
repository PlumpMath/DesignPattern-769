/***********************************************************************
 * Module:  CashRebate.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashRebate
 ***********************************************************************/

import java.util.*;

/** 打折收费子类 */
public class CashRebate extends CashSuper {
   private double moneyRebate = 1;
   

/** 打折收费，初始化时提供折扣率
    * 
    * @param moneyRebate */
   public CashRebate(String moneyRebate) {
      // TODO: implement
	   this.moneyRebate = Double.parseDouble(moneyRebate);
   }
   
   /** 打折收费，初始化时必须要输入折扣率
    * 
    * @param money */
   public double acceptCash(double money) {
      // TODO: implement
      return money * moneyRebate;
   }

}