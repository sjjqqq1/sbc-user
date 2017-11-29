package com.qxin.sbcuser.common.req;

public class UserReq extends BaseRequest{
	
	private long userId;
	
	public void setUserId(long userId) {
		this.userId=userId;
	}
	
	public long  getUserId() {
		return userId;
	}
}
