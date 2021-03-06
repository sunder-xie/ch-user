package com.ai.ch.user.service.business.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreResponse;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScore;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScoreCriteria;
import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.service.atom.interfaces.ICurrentScoreAtomSV;
import com.ai.ch.user.service.atom.interfaces.IScoreLogAtomSV;
import com.ai.ch.user.service.business.interfaces.ICurrentScoreBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;

@Component
@Transactional
public class CurrentScoreBusiSVImpl implements ICurrentScoreBusiSV {

	@Autowired
	private ICurrentScoreAtomSV currentScoreAtomSV;
	
	@Autowired
	private IScoreLogAtomSV scoreLogAtomSV;

	@Override
	public QueryCurrentScoreResponse queryCurrentScore(QueryCurrentScoreRequest request)
			throws BusinessException, SystemException {

		CtCurrentScoreCriteria example = new CtCurrentScoreCriteria();
		CtCurrentScoreCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		QueryCurrentScoreResponse response = new QueryCurrentScoreResponse();
		List<CtCurrentScore> list = currentScoreAtomSV.selectByExample(example);
		if (!CollectionUtil.isEmpty(list)) {
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;

	}

	@Override
	public void insertCurrentScore(InsertCurrentScoreRequest request) throws BusinessException, SystemException {
		CtCurrentScore ctCurrentScore = new CtCurrentScore();
		BeanUtils.copyProperties(request, ctCurrentScore);
		ctCurrentScore.setScoreDate(DateUtil.getSysDate());
		currentScoreAtomSV.insert(ctCurrentScore);
		CtScoreLog ctScoreLog = new CtScoreLog();
		BeanUtils.copyProperties(ctCurrentScore, ctScoreLog);
		scoreLogAtomSV.insert(ctScoreLog);
	}

	@Override
	public int updateCurrentScore(UpdateCurrentScoreRequest request) throws BusinessException, SystemException {
		CtCurrentScoreCriteria example = new CtCurrentScoreCriteria();
		CtCurrentScoreCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		CtCurrentScore ctCurrentScore = new CtCurrentScore();
		BeanUtils.copyProperties(request, ctCurrentScore);
		ctCurrentScore.setScoreDate(DateUtil.getSysDate());
		return currentScoreAtomSV.updateByExample(ctCurrentScore, example);
	}

}
