package com.bin.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-06 09:26:01
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

