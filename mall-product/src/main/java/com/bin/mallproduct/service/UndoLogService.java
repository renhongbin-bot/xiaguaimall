package com.bin.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallproduct.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-06 09:26:00
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

