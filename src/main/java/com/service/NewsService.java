package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NewsEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NewsVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NewsView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 书城活动
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NewsVO> selectListVO(QueryWrapper<NewsEntity> wrapper);
   	
   	NewsVO selectVO(@Param("ew") QueryWrapper<NewsEntity> wrapper);
   	
   	List<NewsView> selectListView(QueryWrapper<NewsEntity> wrapper);
   	
   	NewsView selectView(@Param("ew") QueryWrapper<NewsEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<NewsEntity> wrapper);
   	

}

