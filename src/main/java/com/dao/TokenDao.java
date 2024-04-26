
package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.entity.TokenEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * token
 */
public interface TokenDao extends BaseMapper<TokenEntity> {
	
	List<TokenEntity> selectListView(@Param("ew") QueryWrapper<TokenEntity> wrapper);

	List<TokenEntity> selectListView(Page<TokenEntity> page, @Param("ew") QueryWrapper<TokenEntity> wrapper);
	
}
