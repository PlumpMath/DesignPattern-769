/***********************************************************************
 * Module:  DivFactory.java
 * Author:  Thinkpad
 * Purpose: Defines the Class DivFactory
 ***********************************************************************/

import java.util.*;

/** 除工厂 */
public class DivFactory implements Factory {
   public Operation createOperation() {
      // TODO: implement
      return new DivOperation();
   }

}