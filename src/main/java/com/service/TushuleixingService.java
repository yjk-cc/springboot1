package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuleixingView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 图书类型
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface TushuleixingService extends IService<TushuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuleixingVO> selectListVO(QueryWrapper<TushuleixingEntity> wrapper);
   	
   	TushuleixingVO selectVO(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);
   	
   	List<TushuleixingView> selectListView(QueryWrapper<TushuleixingEntity> wrapper);
   	
   	TushuleixingView selectView(@Param("ew") QueryWrapper<TushuleixingEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<TushuleixingEntity> wrapper);


}

