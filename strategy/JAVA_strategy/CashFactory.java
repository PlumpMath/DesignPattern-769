/***********************************************************************
 * Module:  CashFactory.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashFactory
 ***********************************************************************/

import java.util.*;

/** 现金收费工厂类 */
public class CashFactory {
   /** @param type */
   public static CashSuper createCashAccept(String type) {
      // TODO: implement
	   CashSuper cs = null;
	   switch(type)
	   {
	   case "正常收费":
		   cs = new CashNormal();
		   break;
	   case "打八折":
		   cs = new CashRebate("0.8");
		   break;
	   case "满300返100":
		   cs = new CashReturn(300,100);
		   break;
		   default:
			   break;
	   }
      return cs;
   }

}