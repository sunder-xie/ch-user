package com.ai.ch.user.rank.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.rank.interfaces.IRankSV;
import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class RankSVImpl {

	@Autowired
	private IRankSV rankSV;
	
	@Test
	public void testInsertRankRule(){
		InsertRankRuleRequest re = new InsertRankRuleRequest();
		re.setTenantId("ch");
		re.setRankName("青铜");
		re.setRank(5);
		re.setPeriodType("一年");
		re.setOperId(123456L);
		re.setMaxFee(123445L);
		re.setMinFee(123445L);
		rankSV.insertRankRule(re);
	}
	@Test
	public void testUpdateRankRule(){
		UpdateRankRuleRequest re = new UpdateRankRuleRequest();
		re.setTenantId("ch");
		re.setRankName("白银");
		re.setRank(5);
		re.setPeriodType("一年");
		re.setOperId(123456L);
		re.setMaxFee(123445L);
		re.setMinFee(123445L);
		rankSV.updateRankRule(re);
	}
	@Test
	public void testQueryRankRule(){
		QueryRankRuleRequest re = new QueryRankRuleRequest();
		re.setTenantId("ch");
		System.out.println(JSON.toJSONString(rankSV.queryRankRule(re)));
	}
	
}
