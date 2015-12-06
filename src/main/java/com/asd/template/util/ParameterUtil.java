package com.asd.template.util;

/**
 * 参数工具类
 */
public class ParameterUtil {

	/**
	 * 检查参数，如果为空，则抛异常
	 */
	public static void checkIsNull(Object... objects) {
		if (objects == null) {
			ExceptionUtil.throwRuntime("args empty");
		}
		for (Object obj : objects) {
			if (obj == null) {
				ExceptionUtil.throwRuntime("args empty");
			}
		}
	}

	/**
	 * 检查参数是否有空的参数
	 * 
	 * @return true 有null的参数 false 无null的参数
	 */
	public static boolean containsNull(Object... objects) {
		if (objects == null) {
			return true;
		}
		for (Object obj : objects) {
			if (obj == null) {
				return true;
			}
		}
		return false;
	}
}
