/***********************************************************************
 * Module:  State.java
 * Author:  Thinkpad
 * Purpose: Defines the Class State
 ***********************************************************************/

import java.util.*;

/** 抽象状态类，定义一个接口以封装与Context的一个特定状态相关的行为 */
public abstract class State {
	public String name;
   /** @param context */
   public abstract void handle(Context context);

}