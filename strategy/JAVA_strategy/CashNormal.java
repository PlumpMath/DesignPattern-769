/***********************************************************************
 * Module:  CashNormal.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashNormal
 ***********************************************************************/

import java.util.*;

/** 正常收费子类 */
public class CashNormal extends CashSuper {
   /** 现金收取超类抽象方法，收取现金，参数为原价，返回为当前价
    * 
    * @param money */
   public double acceptCash(double money) {
      // TODO: implement
      return money;
   }

}