package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.car.save response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsAutoCarSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4298494584718117465L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarNo( ) {
		return this.carNo;
	}

}
