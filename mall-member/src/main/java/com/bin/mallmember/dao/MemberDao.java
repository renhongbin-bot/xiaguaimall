package com.bin.mallmember.dao;

import com.bin.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-08 14:00:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
