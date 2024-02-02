package com.ruizhili.novabazaar.coupon.dao;

import com.ruizhili.novabazaar.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:12:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
