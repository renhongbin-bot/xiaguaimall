package com.bin.mallproduct.dao;

import com.bin.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-06 09:26:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
