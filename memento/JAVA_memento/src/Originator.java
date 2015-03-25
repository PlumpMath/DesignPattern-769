/***********************************************************************
 * Module:  Originator.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Originator
 ***********************************************************************/

import java.util.*;

public class Originator {
   /** 创建者 */
   private String state;
   
   /** 恢复当前状态为备忘录里的状态
    * 
    * @param mem */
   public void setMemento(Memento mem) {
      // TODO: implement
	   this.state = mem.getState();
   }
   
   /** 创建备忘录 */
   public Memento createMemento() {
      // TODO: implement
      return new Memento(state);
   }

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

}