
package com.service.impl;


import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import com.dao.ConfigDao;
import com.entity.ConfigEntity;
import com.service.ConfigService;
import com.utils.PageUtils;
import com.utils.Query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/**
 * 系统用户
 */
public class ConfigServiceImpl extends ServiceImpl<ConfigDao, ConfigEntity> implements ConfigService {
	@Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ConfigEntity> wrapper) {
		int pageNum = Integer.parseInt(params.getOrDefault("pageNum", 1).toString());
		int pageSize = Integer.parseInt(params.getOrDefault("pageSize", 10).toString());

		Page<ConfigEntity> page = new Page<>(pageNum, pageSize);

		// 执行分页查询
		IPage<ConfigEntity> resultPage = baseMapper.selectPage(page, wrapper);

		return new PageUtils(resultPage.getRecords(), resultPage.getTotal(), resultPage.getSize(), resultPage.getCurrent());
	}
}
