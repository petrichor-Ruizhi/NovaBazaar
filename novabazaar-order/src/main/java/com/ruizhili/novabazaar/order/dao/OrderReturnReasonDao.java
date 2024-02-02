package com.ruizhili.novabazaar.order.dao;

import com.ruizhili.novabazaar.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:40:29
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
