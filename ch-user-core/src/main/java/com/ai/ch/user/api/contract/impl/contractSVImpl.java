package com.ai.ch.user.api.contract.impl;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.contract.interfaces.IContractSV;
import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.ai.ch.user.constants.ExceptCodeConstants;
import com.ai.ch.user.service.business.interfaces.IContractBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class contractSVImpl implements IContractSV {

	private static final Log log = LogFactory.getLog(contractSVImpl.class);

	@Autowired
	private IContractBusiSV contractBusiSV;

	@Override
	@POST
	@Path("/insertContractInfo")
	public BaseResponse insertContractInfo(ContactInfoRequest contactRequest)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = null;
		try {
			contractBusiSV.insertContractInfo(contactRequest);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/queryContractInfo")
	public ContractInfoResponse queryContractInfo(ContactInfoRequest contactRequest)
			throws BusinessException, SystemException {
		ResponseHeader responseHeader = null;
		ContractInfoResponse response = new ContractInfoResponse();
		try {
			response = contractBusiSV.queryContractInfo(contactRequest);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/queryAllContractInfo")
	public List<ContractInfoResponse> queryAllContractInfo(ContactInfoRequest contactRequest)
			throws BusinessException, SystemException {
		ResponseHeader responseHeader = null;
		List<ContractInfoResponse> list = null;
		ContractInfoResponse response = new ContractInfoResponse();
		try {
			list = contractBusiSV.queryAllContractInfo(contactRequest);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
			log.error("查询合同信息失败",e);
		}
		response.setResponseHeader(responseHeader);
		return list;
	}

}
