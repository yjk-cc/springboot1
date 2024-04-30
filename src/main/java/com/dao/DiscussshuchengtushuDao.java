package com.dao;

import com.entity.DiscussshuchengtushuEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshuchengtushuVO;
import com.entity.view.DiscussshuchengtushuView;


/**
 * 书城图书评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
public interface DiscussshuchengtushuDao extends BaseMapper<DiscussshuchengtushuEntity> {
	
	List<DiscussshuchengtushuVO> selectListVO(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
	
	DiscussshuchengtushuVO selectVO(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
	
	List<DiscussshuchengtushuView> selectListView(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);

	List<DiscussshuchengtushuEntity> selectListView(Page<DiscussshuchengtushuEntity> page, @Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
	
	DiscussshuchengtushuView selectView(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
	

}
