package com.asd.template.util;

import com.asd.template.constants.RetCode;
import com.asd.template.model.Result;

/**
 * 调用结果Result帮助类
 */
public class ResultUtil {

	/**
	 * 生成成功的result:status=0,msg=null
	 * 
	 * @param data
	 *            result中包含的对象
	 */
	public static <T> Result<T> genResultWithSuccess(T data) {
		return new Result<T>(RetCode.SUCCESS, "", data);
	}

	/**
	 * 生成result
	 * 
	 * @param status
	 *            结果状态码
	 * @param msg
	 *            说明信息（status非0时使用）
	 * @param data
	 *            result中包含的对象
	 */
	public static <T> Result<T> genResult(Integer status, String msg, T data) {
		return new Result<T>(status, msg, data);
	}

	/**
	 * 生成result:data=null
	 * 
	 * @param status
	 *            结果状态码
	 * @param msg
	 *            说明信息（status非0时使用）
	 */
	public static <T> Result<T> genResult(Integer status, String msg) {
		return new Result<T>(status, msg, null);
	}

}
