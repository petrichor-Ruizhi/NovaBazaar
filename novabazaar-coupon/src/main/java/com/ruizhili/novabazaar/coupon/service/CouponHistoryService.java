package com.ruizhili.novabazaar.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:12:40
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

