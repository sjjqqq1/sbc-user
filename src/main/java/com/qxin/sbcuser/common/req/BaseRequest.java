package com.qxin.sbcuser.common.req;

import io.swagger.annotations.ApiModelProperty;

public class BaseRequest {
	
	@ApiModelProperty(required=false,value="唯一请求号",example="123456")
	private String reqNo;
	
	@ApiModelProperty(required=false,value="当前请求时间",example="0")
	private int timeStamp;
	
    public BaseRequest() {
        this.setTimeStamp((int)(System.currentTimeMillis() / 1000));
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }


    @Override
    public String toString() {
	        return "BaseRequest{" +
	    "reqNo='" + reqNo + '\'' +
	    ", timeStamp=" + timeStamp +
	    '}';
    }
}
