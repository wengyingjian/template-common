package com.asd.template.util;

/**
 * 异常工具类
 */
public class ExceptionUtil {

	/**
	 * 抛runtime异常
	 */
	public static void throwRuntime(String string) {
		throw new RuntimeException(string);
	}

}
