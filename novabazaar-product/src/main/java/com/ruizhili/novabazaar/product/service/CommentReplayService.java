package com.ruizhili.novabazaar.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-28 14:54:47
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

