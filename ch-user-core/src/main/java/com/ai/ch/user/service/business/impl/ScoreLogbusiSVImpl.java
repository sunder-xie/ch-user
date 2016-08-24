package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.score.param.CtScoreLogVo;
import com.ai.ch.user.api.score.param.InsertScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogResponse;
import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.service.atom.interfaces.IScoreLogAtomSV;
import com.ai.ch.user.service.business.interfaces.IScoreLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.DateUtil;

@Component
@Transactional
public class ScoreLogbusiSVImpl implements IScoreLogBusiSV {

	@Autowired
	private IScoreLogAtomSV scoreLogAtomSV;

	@Override
	public int insertScoreLog(InsertScoreLogRequest request) throws BusinessException, SystemException {
		CtScoreLog ctScoreLog = new CtScoreLog();
		BeanUtils.copyProperties(request, ctScoreLog);
		ctScoreLog.setScoreDate(DateUtil.getSysDate());
		return scoreLogAtomSV.insert(ctScoreLog);
	}

	@Override
	public QueryScoreLogResponse queryScoreLog(QueryScoreLogRequest request) throws BusinessException, SystemException {
		QueryScoreLogResponse response = new QueryScoreLogResponse();
		int count = scoreLogAtomSV.queryCountScoreLog(request.getTenantId(), request.getUserId());

		PageInfo<CtScoreLogVo> pageInfo = new PageInfo<CtScoreLogVo>();
		pageInfo.setCount(count);

		int pageNo = request.getPageNo();
		int pageSize = request.getPageSize();
		int startPage = (pageNo - 1) * pageSize;
		int endPage = pageSize;

		List<CtScoreLog> list = scoreLogAtomSV.queryScoreLog(request.getTenantId(), request.getUserId(),
				startPage, endPage);
		List<CtScoreLogVo> responseList = new ArrayList<CtScoreLogVo>();
		for (CtScoreLog ctScoreLog : list) {
			CtScoreLogVo ctScoreLogVo = new CtScoreLogVo();
			BeanUtils.copyProperties(ctScoreLog, ctScoreLogVo);
			responseList.add(ctScoreLogVo);
		}

		pageInfo.setPageNo(pageNo);
		pageInfo.setPageSize(pageSize);
		int pageCount = count / pageSize + (count % pageSize > 0 ? 1 : 0);
		pageInfo.setPageCount(pageCount);
		pageInfo.setResult(responseList);
		response.setPageInfo(pageInfo);
		return response;
	}

}
