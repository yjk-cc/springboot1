package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshuchengtushuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshuchengtushuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshuchengtushuView;


/**
 * 书城图书评论表
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
public interface DiscussshuchengtushuService extends IService<DiscussshuchengtushuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuchengtushuVO> selectListVO(Wrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	DiscussshuchengtushuVO selectVO(@Param("ew") Wrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	List<DiscussshuchengtushuView> selectListView(Wrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	DiscussshuchengtushuView selectView(@Param("ew") Wrapper<DiscussshuchengtushuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuchengtushuEntity> wrapper);
   	

}

