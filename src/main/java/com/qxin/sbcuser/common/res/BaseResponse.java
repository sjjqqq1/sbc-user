package com.qxin.sbcuser.common.res;

import java.io.Serializable;

/*   BaseResponse<T> 表示集合里 装的是T类的实例
 *   把请求号、状态枚举码、状态枚举信息和数据类（T）注入BaseRequests实例
 * */
public class BaseResponse<T> implements Serializable {
	
	private String code;
	private String message;
	private String reqNo;
	private T databody;
	
	public BaseResponse() {
		
	}
	
	public BaseResponse(T databody) {
		this.databody=databody;
	}
	
	public BaseResponse(T databody,String code,String message) {
		this.databody=databody;
		this.code=code;
		this.message=message;
	}
	
	public BaseResponse(T databody,String code,String message,String reqNo) {
		this.databody=databody;
		this.code=code;
		this.message=message;
		this.reqNo=reqNo;
	}
}
