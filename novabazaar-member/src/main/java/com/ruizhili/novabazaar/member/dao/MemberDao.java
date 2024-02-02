package com.ruizhili.novabazaar.member.dao;

import com.ruizhili.novabazaar.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:31:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
