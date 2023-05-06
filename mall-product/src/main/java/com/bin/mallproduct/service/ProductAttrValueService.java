package com.bin.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-06 09:26:00
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

