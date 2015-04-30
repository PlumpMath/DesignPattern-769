/***********************************************************************
 * Module:  Expression.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Expression
 ***********************************************************************/

import java.util.*;

/** 解释器 */
public abstract class Expression {
   /** 获得key和value
    * 解析被解释文本
    * 
    * @param context */
   public void interpret(PlayContext context) {
      // TODO: implement
   }
   
   /** 执行key和value的操作
    * 
    * @param key 
    * @param value */
   public abstract void excute(int key, int value);

}