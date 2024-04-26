package com.dao;

import com.entity.StoreupEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import org.apache.ibatis.annotations.Param;
import com.entity.vo.StoreupVO;
import com.entity.view.StoreupView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 收藏表
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface StoreupDao extends BaseMapper<StoreupEntity> {
	
	List<StoreupVO> selectListVO(@Param("ew") QueryWrapper<StoreupEntity> wrapper);
	
	StoreupVO selectVO(@Param("ew") QueryWrapper<StoreupEntity> wrapper);
	
	List<StoreupView> selectListView(@Param("ew") QueryWrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(Page<StoreupEntity> page, @Param("ew") QueryWrapper<StoreupEntity> wrapper);
	
	StoreupView selectView(@Param("ew") QueryWrapper<StoreupEntity> wrapper);
	

}
