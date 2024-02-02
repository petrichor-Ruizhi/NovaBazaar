package com.ruizhili.novabazaar.product.dao;

import com.ruizhili.novabazaar.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-28 14:54:47
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
