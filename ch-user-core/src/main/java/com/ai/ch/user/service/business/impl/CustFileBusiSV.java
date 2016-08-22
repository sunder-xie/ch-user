package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.custfile.params.CmCustFileExtVo;
import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.ch.user.constants.SequenceCodeConstants.UserSequenceCode;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExt;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExtCriteria;
import com.ai.ch.user.service.atom.interfaces.ICustFileAtomSV;
import com.ai.ch.user.service.business.interfaces.ICustFileBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class CustFileBusiSV implements ICustFileBusiSV {

	@Autowired
	private ICustFileAtomSV custFileAtomSV;
	
	@Override
	public int insertCustFileExt(InsertCustFileExtRequest request) throws SystemException, BusinessException {
		if(!request.getList().isEmpty()){
			for(CmCustFileExtVo cmCustFileExtVo : request.getList()){
				CmCustFileExt cmCustFileExt = new CmCustFileExt();
				BeanUtils.copyProperties(cmCustFileExtVo, cmCustFileExt);
				cmCustFileExt.setInfoExtId(SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18));
				custFileAtomSV.insert(cmCustFileExt);
			}
		}
		return 0;
	}

	@Override
	public QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)
			throws SystemException, BusinessException {
		CmCustFileExtCriteria example = new CmCustFileExtCriteria();
		CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		List<CmCustFileExt> list = custFileAtomSV.selectByExample(example);
		List<CmCustFileExtVo> responseList = new ArrayList<CmCustFileExtVo>();
		for (CmCustFileExt cmCustFileExt : list) {
			CmCustFileExtVo cmCustFileExtVo = new CmCustFileExtVo();
			BeanUtils.copyProperties(cmCustFileExt, cmCustFileExtVo);
		}
		QueryCustFileExtResponse response = new QueryCustFileExtResponse();
		response.setList(responseList);
		return response;
	}

	@Override
	public int updateCustFileExt(UpdateCustFileExtRequest request) throws SystemException, BusinessException {
		if(!request.getList().isEmpty()){
			CmCustFileExtCriteria example = new CmCustFileExtCriteria();
			CmCustFileExtCriteria.Criteria criteria = example.createCriteria();
			criteria.andTenantIdEqualTo(request.getTenantId());
			custFileAtomSV.deleteByExample(example);
			for(CmCustFileExtVo cmCustFileExtVo : request.getList()){
				CmCustFileExt cmCustFileExt = new CmCustFileExt();
				BeanUtils.copyProperties(cmCustFileExtVo, cmCustFileExt);
				cmCustFileExt.setInfoExtId(SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18));
				custFileAtomSV.insert(cmCustFileExt);
			}
		}
		return 0;
	}

}
