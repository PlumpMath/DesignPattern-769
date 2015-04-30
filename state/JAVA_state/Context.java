/***********************************************************************
 * Module:  Context.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Context
 ***********************************************************************/

import java.util.*;

/** 维护一个ConcreteState子类的实例，这个实例定义当前的状态 */
public class Context {
   private State state;
   
   /** 对请求做处理，并设置下一个状态 请求有很多选择，根据不同选择做不同处理，并跳转到不同状态 */
   public void request() {
      // TODO: implement
	   state.handle(this);
   }
   
   /** @param state */
   public Context(State state) {
      // TODO: implement
	   this.state = state;
   }

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
	System.out.println("当前状态："+state.name);
}

}