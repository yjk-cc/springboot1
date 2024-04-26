package com.dao;

import com.entity.NewsEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NewsVO;
import com.entity.view.NewsView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 书城活动
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
public interface NewsDao extends BaseMapper<NewsEntity> {
	
	List<NewsVO> selectListVO(@Param("ew") QueryWrapper<NewsEntity> wrapper);
	
	NewsVO selectVO(@Param("ew") QueryWrapper<NewsEntity> wrapper);
	
	List<NewsView> selectListView(@Param("ew") QueryWrapper<NewsEntity> wrapper);

	List<NewsView> selectListView(Page<NewsEntity> page, @Param("ew") QueryWrapper<NewsEntity> wrapper);
	
	NewsView selectView(@Param("ew") QueryWrapper<NewsEntity> wrapper);
	

}
