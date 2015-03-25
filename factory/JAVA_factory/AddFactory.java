/***********************************************************************
 * Module:  AddFactory.java
 * Author:  Thinkpad
 * Purpose: Defines the Class AddFactory
 ***********************************************************************/

import java.util.*;

/** 加工厂 */
public class AddFactory implements Factory {
   public Operation createOperation() {
      // TODO: implement
      return new AddOperation();
   }

}