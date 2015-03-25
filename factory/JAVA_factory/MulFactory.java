/***********************************************************************
 * Module:  MulFactory.java
 * Author:  Thinkpad
 * Purpose: Defines the Class MulFactory
 ***********************************************************************/

import java.util.*;

/** 乘工厂 */
public class MulFactory implements Factory {
   public Operation createOperation() {
      // TODO: implement
      return new MulOperation();
   }

}