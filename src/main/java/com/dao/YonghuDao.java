package com.dao;

import com.entity.YonghuEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuVO;
import com.entity.view.YonghuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 用户
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface YonghuDao extends BaseMapper<YonghuEntity> {
	
	List<YonghuVO> selectListVO(@Param("ew") QueryWrapper<YonghuEntity> wrapper);
	
	YonghuVO selectVO(@Param("ew") QueryWrapper<YonghuEntity> wrapper);
	
	List<YonghuView> selectListView(@Param("ew") QueryWrapper<YonghuEntity> wrapper);

	List<YonghuEntity> selectListView(Page<YonghuEntity> page, @Param("ew") QueryWrapper<YonghuEntity> wrapper);
	
	YonghuView selectView(@Param("ew") QueryWrapper<YonghuEntity> wrapper);
	

}
