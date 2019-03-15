package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息行业设置修改接口
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:14:23
 */
public class AlipayOpenPublicTemplateMessageIndustryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8651868451325814194L;

	/**
	 * 服务窗消息模板所属主行业一/二级编码
	 */
	@ApiField("primary_industry_code")
	private String primaryIndustryCode;

	/**
	 * 服务窗消息模板所属主行业一/二级名称，<a href="https://doc.open.alipay.com/doc2/detail?treeId=197&docType=1&articleId=105043">查看行业信息</a>
	 */
	@ApiField("primary_industry_name")
	private String primaryIndustryName;

	/**
	 * 服务窗消息模板所属副行业一/二级编码
	 */
	@ApiField("secondary_industry_code")
	private String secondaryIndustryCode;

	/**
	 * 服务窗消息模板所属副行业一/二级名称
	 */
	@ApiField("secondary_industry_name")
	private String secondaryIndustryName;

	public String getPrimaryIndustryCode() {
		return this.primaryIndustryCode;
	}
	public void setPrimaryIndustryCode(String primaryIndustryCode) {
		this.primaryIndustryCode = primaryIndustryCode;
	}

	public String getPrimaryIndustryName() {
		return this.primaryIndustryName;
	}
	public void setPrimaryIndustryName(String primaryIndustryName) {
		this.primaryIndustryName = primaryIndustryName;
	}

	public String getSecondaryIndustryCode() {
		return this.secondaryIndustryCode;
	}
	public void setSecondaryIndustryCode(String secondaryIndustryCode) {
		this.secondaryIndustryCode = secondaryIndustryCode;
	}

	public String getSecondaryIndustryName() {
		return this.secondaryIndustryName;
	}
	public void setSecondaryIndustryName(String secondaryIndustryName) {
		this.secondaryIndustryName = secondaryIndustryName;
	}

}
