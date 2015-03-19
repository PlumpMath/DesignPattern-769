/***********************************************************************
 * Module:  CashSuper.java
 * Author:  Thinkpad
 * Purpose: Defines the Class CashSuper
 ***********************************************************************/

import java.util.*;

/** 现金收费抽象类 */
public abstract class CashSuper {
   /** 现金收取超类抽象方法，收取现金，参数为原价，返回为当前价
    * 
    * @param money */
   public abstract double acceptCash(double money);

}