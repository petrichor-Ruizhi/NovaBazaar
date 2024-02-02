package com.ruizhili.novabazaar.warehouse.dao;

import com.ruizhili.novabazaar.warehouse.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:43:56
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
