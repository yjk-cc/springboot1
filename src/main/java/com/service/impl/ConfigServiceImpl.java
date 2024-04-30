
package com.service.impl;


import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import com.dao.ConfigDao;
import com.entity.ConfigEntity;
import com.service.ConfigService;
import com.utils.PageUtils;
import com.utils.Query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;




/**
 * 系统用户
 */
@Service("configService")
public class ConfigServiceImpl extends ServiceImpl<ConfigDao, ConfigEntity> implements ConfigService {

	@Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ConfigEntity> wrapper) {
		Page<ConfigEntity> page = new Page<>(Long.parseLong(params.getOrDefault("page", "1").toString()), Long.parseLong(params.getOrDefault("limit", "10").toString()));
		page = baseMapper.selectPage(page, wrapper);
		return new PageUtils(page);
	}
}

/*
@Service("configService")
public abstract class ConfigServiceImpl extends MybatisPlusInterceptor<ConfigDao, ConfigEntity> implements ConfigService {
//public abstract class ConfigServiceImpl extends ServiceImpl<ConfigDao, ConfigEntity> implements ConfigService {
	@Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ConfigEntity> wrapper) {
		Page<ConfigEntity> page = this.selectPage(
				new Query<ConfigEntity>(params).getPage(),
				wrapper
		);
		return new PageUtils(page);
	}
}


*/


