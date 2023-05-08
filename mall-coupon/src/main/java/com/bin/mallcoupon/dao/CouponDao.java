package com.bin.mallcoupon.dao;

import com.bin.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-08 11:27:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
