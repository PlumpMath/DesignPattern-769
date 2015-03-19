/***********************************************************************
 * Module:  CashReturn.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashReturn
 ***********************************************************************/

import java.util.*;

/** 返利收费 */
public class CashReturn extends CashSuper {
   private double moneyCondition = 0.0;
   private double moneyReturn = 0.0;
   
   /** 返利收费，初始化时必须要输入返利条件和返利值
    * 
    * @param moneyConditon 
    * @param moneyRetun */
   public CashReturn(double moneyConditon, double moneyRetun) {
      // TODO: implement
	   this.moneyCondition = moneyConditon;
	   this.moneyReturn = moneyRetun;
   }
   
   /** @param money */
   public double acceptCash(double money) {
      // TODO: implement
      double result = money;
      if(money >= moneyCondition){
    	  result = money - moneyReturn;
      }
	   return result;
   }

}