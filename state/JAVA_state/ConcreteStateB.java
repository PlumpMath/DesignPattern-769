/***********************************************************************
 * Module:  ConcreteStateB.java
 * Author:  Thinkpad
 * Purpose: Defines the Class ConcreteStateB
 ***********************************************************************/

import java.util.*;

/** 具体状态，每一子类实现一个与Context的一个状态相关的行为 */
public class ConcreteStateB extends State {
   /** @param context */
	public ConcreteStateB()
	{
		this.name = "状态B";
	}
   public void handle(Context context) {
      // TODO: implement
	   context.setState(new ConcreteStateC());
   }

}