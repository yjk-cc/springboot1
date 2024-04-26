package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshuchengtushuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshuchengtushuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshuchengtushuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * 书城图书评论表
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
public interface DiscussshuchengtushuService extends IService<DiscussshuchengtushuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuchengtushuVO> selectListVO(QueryWrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	DiscussshuchengtushuVO selectVO(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	List<DiscussshuchengtushuView> selectListView(QueryWrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	DiscussshuchengtushuView selectView(@Param("ew") QueryWrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<DiscussshuchengtushuEntity> wrapper);
   	

}

