package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustRiskIdentify;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.riskidentify.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayTrustUserRiskidentifyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4514234293641526924L;

	/** 
	 * 行业关注名单识别结果
	 */
	@ApiField("ali_trust_risk_identify")
	private AliTrustRiskIdentify aliTrustRiskIdentify;

	public void setAliTrustRiskIdentify(AliTrustRiskIdentify aliTrustRiskIdentify) {
		this.aliTrustRiskIdentify = aliTrustRiskIdentify;
	}
	public AliTrustRiskIdentify getAliTrustRiskIdentify( ) {
		return this.aliTrustRiskIdentify;
	}

}