package com.asd.template.util;

/**
 * 字符串工具类
 */
public class StringUtil {

	/**
	 * 检查是否有为null或者""的字符串
	 * 
	 * @param str
	 *            受检查的字符串
	 * @return true 字符串为空或者"" <br/>
	 *         false 字符串不为null也不为""
	 */
	public static boolean isEmpty(String... strs) {
		if (strs == null) {
			return true;
		}
		for (String str : strs) {
			if (str == null || "".equals(str)) {
				return true;
			}
		}
		return false;
	}
}
