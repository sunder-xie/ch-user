package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.attach.CtScoreLogAttachMapper;
import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IShopInfoAtomSV;

@Component
public class ShopInfoAtomSV implements IShopInfoAtomSV {

	@Autowired
	CtScoreLogAttachMapper ctScoreLogAttachMapper;
	
	@Override
	public int insert(ShopInfo record) {
		return MapperFactory.getShopInfoMapperMapper().insert(record);
	}

	@Override
	public List<ShopInfo> selectByExample(ShopInfoCriteria example) {
		return MapperFactory.getShopInfoMapperMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(ShopInfo record, ShopInfoCriteria example) {
		return MapperFactory.getShopInfoMapperMapper().updateByExample(record, example);
	}
	
	@Override
	public int updateByExampleSelective(ShopInfo record, ShopInfoCriteria example) {
		return MapperFactory.getShopInfoMapperMapper().updateByExampleSelective(record, example);
	}

	@Override
	public List<CtDepositRule> selectByExample(CtDepositRuleCriteria example) {
		return MapperFactory.getCtDepositRuleMapper().selectByExample(example);
	}

	@Override
	public ShopInfo selectOne(String tenantId,String shopName) {
		return ctScoreLogAttachMapper.selectOne(tenantId, shopName);
	}

}
