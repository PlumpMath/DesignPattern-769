/***********************************************************************
 * Module:  RealSubjecct.java
 * Author:  Thinkpad
 * Purpose: Defines the Class RealSubjecct
 ***********************************************************************/

import java.util.*;

/** RealSubject类，定义了Proxy所代表的真实实体 */
public class RealSubjecct extends Subject {
   /** 请求接口 */
   public void request() {
      // TODO: implement
	   System.out.println("真实的请求");
   }

}