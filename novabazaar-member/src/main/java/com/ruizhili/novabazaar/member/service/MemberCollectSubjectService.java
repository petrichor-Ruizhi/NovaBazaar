package com.ruizhili.novabazaar.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:31:08
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

