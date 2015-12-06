package com.asd.template.model;

/**
 * 调用结果包装类<br/>
 * 如果调用过程中出现错误，则返回错误的status的Result；否则返回status＝0的Result
 * 
 */
public class Result<T> {

	private Integer status;
	private String msg;
	private T data;

	public Result(Integer status, String msg, T data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}

}
