package com.dao;

import com.entity.OrdersEntity;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import org.apache.ibatis.annotations.Param;
import com.entity.vo.OrdersVO;
import com.entity.view.OrdersView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 订单
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface OrdersDao extends BaseMapper<OrdersEntity> {
	
	List<OrdersVO> selectListVO(@Param("ew") QueryWrapper<OrdersEntity> wrapper);
	
	OrdersVO selectVO(@Param("ew") QueryWrapper<OrdersEntity> wrapper);
	
	List<OrdersView> selectListView(@Param("ew") QueryWrapper<OrdersEntity> wrapper);

	List<OrdersView> selectListView(Page<OrdersEntity> page, @Param("ew") QueryWrapper<OrdersEntity> wrapper);
	
	OrdersView selectView(@Param("ew") QueryWrapper<OrdersEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params, @Param("ew") QueryWrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params, @Param("ew") QueryWrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params, @Param("ew") QueryWrapper<OrdersEntity> wrapper);
}
