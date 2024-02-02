package com.ruizhili.novabazaar.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruizhili.common.utils.PageUtils;
import com.ruizhili.novabazaar.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author RuizhiLi
 * @email ruizhili@usc.edu
 * @date 2024-01-28 14:54:47
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

