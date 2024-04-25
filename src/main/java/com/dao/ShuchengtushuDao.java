package com.dao;

import com.entity.ShuchengtushuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuchengtushuVO;
import com.entity.view.ShuchengtushuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 书城图书
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface ShuchengtushuDao extends BaseMapper<ShuchengtushuEntity> {
	
	List<ShuchengtushuVO> selectListVO(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
	
	ShuchengtushuVO selectVO(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
	
	List<ShuchengtushuView> selectListView(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);

	List<ShuchengtushuView> selectListView(Pagination page, @Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
	
	ShuchengtushuView selectView(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
	

}
