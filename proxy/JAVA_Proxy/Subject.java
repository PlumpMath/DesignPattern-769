/***********************************************************************
 * Module:  Subject.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Subject
 ***********************************************************************/

import java.util.*;

/** 主题类，定义了RealSubject和Proxy的共用接口 */
public abstract class Subject {
   /** 请求接口 */
   public abstract void request();

}