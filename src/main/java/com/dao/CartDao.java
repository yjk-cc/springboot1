package com.dao;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CartVO;
import com.entity.view.CartView;


/**
 * 购物车表
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface CartDao extends BaseMapper<CartEntity> {
	
	List<CartVO> selectListVO(@Param("ew") QueryWrapper<CartEntity> wrapper);
	
	CartVO selectVO(@Param("ew") QueryWrapper<CartEntity> wrapper);
	
	List<CartView> selectListView(@Param("ew") QueryWrapper<CartEntity> wrapper);

	List<CartView> selectListView(Pagination page, @Param("ew") QueryWrapper<CartEntity> wrapper);
	
	CartView selectView(@Param("ew") QueryWrapper<CartEntity> wrapper);
	

}
