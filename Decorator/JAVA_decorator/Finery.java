/***********************************************************************
 * Module:  Finery.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Finery
 ***********************************************************************/

import java.util.*;

/** 服饰类 */
public class Finery extends Person {


protected Person component;

   /** @param component */
   public void decorate(Person component) {
      // TODO: implement
	   this.component = component;
   }
   
   public void show() {
      // TODO: implement
	   if(component != null)
	   {
		   component.show();
	   }
   }

}