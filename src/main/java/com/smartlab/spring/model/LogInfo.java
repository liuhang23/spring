package com.smartlab.spring.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//使这个接口可以访问
//@Retention(RetentionPolicy.RUNTIME )修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，会被虚拟机保留在运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInfo {
	//设置默认值
	public String value() default "";
}
