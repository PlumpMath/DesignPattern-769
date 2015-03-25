/***********************************************************************
 * Module:  SubFactory.java
 * Author:  Thinkpad
 * Purpose: Defines the Class SubFactory
 ***********************************************************************/

import java.util.*;

/** 减工厂 */
public class SubFactory implements Factory {
   public Operation createOperation() {
      // TODO: implement
      return new SubOperation();
   }

}