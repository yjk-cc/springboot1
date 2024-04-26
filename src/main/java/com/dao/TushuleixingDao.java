package com.dao;

import com.entity.TushuleixingEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuleixingVO;
import com.entity.view.TushuleixingView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 图书类型
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface TushuleixingDao extends BaseMapper<TushuleixingEntity> {
	
	List<TushuleixingVO> selectListVO(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);
	
	TushuleixingVO selectVO(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);
	
	List<TushuleixingView> selectListView(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);

	List<TushuleixingView> selectListView(Page<TushuleixingEntity> page, @Param("ew") QueryWrapper<TushuleixingEntity> wrapper);
	
	TushuleixingView selectView(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);
	

}
