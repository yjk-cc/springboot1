
package com.service;

import java.util.Map;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.entity.ConfigEntity;
import com.utils.PageUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 系统用户
 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params, QueryWrapper<ConfigEntity> wrapper);
}
