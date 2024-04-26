
package com.service;

import java.util.List;
import java.util.Map;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.entity.UserEntity;
import com.utils.PageUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * 系统用户
 */
public interface UserService extends IService<UserEntity> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<UserEntity> selectListView(QueryWrapper<UserEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<UserEntity> wrapper);

    UserEntity selectOne(QueryWrapper<UserEntity> username);

	void insert(UserEntity user);

	void update(UserEntity user, Object o);

	boolean updateById(UserEntity user);

	UserEntity selectById(String id);

	void deleteBatchIds(List<Long> asList);
}
