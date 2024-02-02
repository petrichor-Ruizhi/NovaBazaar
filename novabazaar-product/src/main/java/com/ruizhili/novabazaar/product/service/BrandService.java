package com.ruizhili.novabazaar.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-28 14:54:47
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

