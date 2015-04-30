/***********************************************************************
 * Module:  ConcreteStateA.java
 * Author:  Thinkpad
 * Purpose: Defines the Class ConcreteStateA
 ***********************************************************************/

import java.util.*;

/** 具体状态，每一子类实现一个与Context的一个状态相关的行为 */
public class ConcreteStateA extends State {
   /** @param context */
	public ConcreteStateA()
	{
		this.name = "状态A";
	}
	
   public void handle(Context context) {
      // TODO: implement
	   context.setState(new ConcreteStateB());
   }

}