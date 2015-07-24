package com.smartlab.spring.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import com.smartlab.spring.model.LogInfo;

/**
 * 动态代理是指：通过一个代理对象来创建需要的业务对象，然后在这个代理对象中统一的进行各种需求的处理
 *   写一个类实现相应的InvocationHandler     创建要代理的对象
 * LogProxy<BR>  
 * 创建人:航大 <BR>
 * 时间：2015年7月7日-下午7:27:00 <BR>
 * @version 1.0.0
 *
 */
public class LogProxy  implements InvocationHandler{  //1.写一类实现InvocationHandler
	//构造方法私有化
	private LogProxy(){ }  
    //2.创建的代理对象
	private Object target;
	//3.创建一个方法来生成对象  这个方法的参数就是要代理的对象,getInstance所返回的对象就是代理对象
	public static Object getInstance(Object o){   
		 //3.1创建LogProxy对象
	     LogProxy proxy = new LogProxy();
	     //3.2设置这个代理对象
	     proxy.target = o;
	     //3.3通过Proxy的方法创建代理对象，第一个参数是要代理对象的classLoader
	     //第二个参数是要代理对象实现的所有接口，第三个参数是实现类InvocationHandler的对象，此时result就是一个代理对象，代理的是o
	     Object result = Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces() , proxy);
	     return result;
	}
	
	//当有了代理对象之后，不管这个代理对象执行什么方法，都会调用一下的invoke方法
	public Object invoke(Object proxy, Method method, Object[] args)  throws Throwable {
//		if(method.getName().equals("add")||method.getName().equals("delete")){
//			Logger.info("进行了相应的操作");
//		}
		if(method.isAnnotationPresent(LogInfo.class)){
			LogInfo li = method.getAnnotation(LogInfo.class);
			Logger.info(li.value());
		}
		Object obj = method.invoke(target, args);	
		return obj;
	}
     
	
}
