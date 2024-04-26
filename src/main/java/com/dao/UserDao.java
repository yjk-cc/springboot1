
package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.entity.UserEntity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 用户
 */
public interface UserDao extends BaseMapper<UserEntity> {
	
	List<UserEntity> selectListView(@Param("ew") QueryWrapper<UserEntity> wrapper);

	List<UserEntity> selectListView(Page<UserEntity> page, @Param("ew") QueryWrapper<UserEntity> wrapper);
	
}
