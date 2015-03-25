/***********************************************************************
 * Module:  Proxy.java
 * Author:  Thinkpad
 * Purpose: Defines the Class Proxy
 ***********************************************************************/

import java.util.*;

public class Proxy extends Subject {
   public RealSubjecct realSubjecct;
   
   /** 请求接口 */
   public void request() {
      // TODO: implement
	   if(realSubjecct == null)
	   {
		   realSubjecct = new RealSubjecct();
	   }
	   realSubjecct.request();
   }
   

}