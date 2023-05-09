package com.bin.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallorder.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-08 14:23:32
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

