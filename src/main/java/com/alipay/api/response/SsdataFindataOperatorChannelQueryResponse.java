package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.channel.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataOperatorChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8759347739561786624L;

	/** 
	 * 运营商渠道信息，其中item_status枚举：ENABLE（可用），DISABLE(不可用)。
	 */
	@ApiListField("channels")
	@ApiField("operator_channel_info")
	private List<OperatorChannelInfo> channels;

	public void setChannels(List<OperatorChannelInfo> channels) {
		this.channels = channels;
	}
	public List<OperatorChannelInfo> getChannels( ) {
		return this.channels;
	}

}
