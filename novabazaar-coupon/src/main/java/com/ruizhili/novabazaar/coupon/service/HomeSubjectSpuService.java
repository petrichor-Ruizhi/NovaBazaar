package com.ruizhili.novabazaar.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-29 18:12:40
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

