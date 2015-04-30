/***********************************************************************
 * Module:  ConcreteStateC.java
 * Author:  Thinkpad
 * Purpose: Defines the Class ConcreteStateC
 ***********************************************************************/

import java.util.*;

/** 具体状态，每一子类实现一个与Context的一个状态相关的行为 */
public class ConcreteStateC extends State {
	public ConcreteStateC()
	{
		this.name = "状态C";
	}
   /** @param context */
   public void handle(Context context) {
      // TODO: implement
	   context.setState(new ConcreteStateA());
   }

}