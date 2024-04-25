package com.dao;

import com.entity.AddressEntity;

//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;



import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AddressVO;
import com.entity.view.AddressView;


/**
 * 地址
 * 
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface AddressDao extends BaseMapper<AddressEntity> {
	
	List<AddressVO> selectListVO(@Param("ew") QueryWrapper<AddressEntity> wrapper);
	
	AddressVO selectVO(@Param("ew") QueryWrapper<AddressEntity> wrapper);
	
	List<AddressView> selectListView(@Param("ew") QueryWrapper<AddressEntity> wrapper);

	List<AddressView> selectListView(Pagination page, @Param("ew") QueryWrapper<AddressEntity> wrapper);
	
	AddressView selectView(@Param("ew") QueryWrapper<AddressEntity> wrapper);
	

}
