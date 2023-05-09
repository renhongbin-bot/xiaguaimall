package com.bin.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-08 14:00:52
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

