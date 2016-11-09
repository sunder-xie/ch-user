package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IDefaultLogBusiSV {

	public String insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException;
	
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException;
	
	public int deleteDefaultLog(String serialCode)throws SystemException, BusinessException;
	
	public QueryFullDefaultLogResponse queryFullDefaultLog(QueryFullDefaultLogRequest request)
			throws SystemException, BusinessException;
}
