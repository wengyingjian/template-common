package com.asd.template.util;

import java.util.Calendar;

/**
 * 日期工具类
 */
public class DataUtil {

	/**
	 * 获取指定时间戳的一天开始时间时间戳
	 * 
	 * @param time
	 *            时间，精确到毫秒
	 * @return 返回精确到毫秒的时间
	 */
	public static long getTimeDayStart(long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTimeInMillis();
	}

	/**
	 * 获取当前开始时间时间戳
	 * 
	 * @param time
	 *            时间，精确到毫秒
	 * @return 返回精确到毫秒的时间
	 */
	public static long getTimeTodayStart() {
		return getTimeDayStart(System.currentTimeMillis());
	}
}
