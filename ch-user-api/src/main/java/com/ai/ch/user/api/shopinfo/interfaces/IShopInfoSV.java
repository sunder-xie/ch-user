package com.ai.ch.user.api.shopinfo.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResposne;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 店铺服务
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/shopinfoservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IShopInfoSV {

	/**
	 * 查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-01
	 * @RestRelativeURL shopinfoservice/queryCurrentScore
	 */
	@POST
	@Path("/queryCurrentScore")
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request)
			throws BusinessException, SystemException;
	
	
	/**
	 * 保存店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-02
	 * @RestRelativeURL shopinfoservice/insertShopInfo
	 */
	@POST
	@Path("/insertShopInfo")
	public BaseResponse insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException;
	
	/**
	 * 更新店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-03
	 * @RestRelativeURL shopinfoservice/updateShopInfo
	 */
	@POST
	@Path("/updateShopInfo")
	public BaseResponse updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询默认保证金
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-04
	 * @RestRelativeURL shopinfoservice/queryDepositRule
	 */
	@POST
	@Path("/queryDepositRule")
	public QueryDepositRuleResposne queryDepositRule(QueryDepositRuleRequest request)throws BusinessException,SystemException;
	
	/**
	 * 保存店铺信息日志
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-05
	 * @RestRelativeURL shopinfoservice/insertShopInfoLog
	 */
	@POST
	@Path("/insertShopInfoLog")
	public BaseResponse insertShopInfoLog(InsertShopInfoLogRequest request)throws BusinessException,SystemException;
	
	/**
	 * 查询店铺信息日志
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-06
	 * @RestRelativeURL shopinfoservice/queryShopInfoLog
	 */
	@POST
	@Path("/queryShopInfoLog")
	public QueryShopInfoLogResponse queryShopInfoLog(QueryShopInfoLogRequest request)throws BusinessException,SystemException;
}
