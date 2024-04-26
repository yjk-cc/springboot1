package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.StoreupEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.StoreupVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.StoreupView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 收藏表
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface StoreupService extends IService<StoreupEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<StoreupVO> selectListVO(QueryWrapper<StoreupEntity> wrapper);
   	
   	StoreupVO selectVO(@Param("ew") QueryWrapper<StoreupEntity> wrapper);
   	
   	List<StoreupView> selectListView(QueryWrapper<StoreupEntity> wrapper);
   	
   	StoreupView selectView(@Param("ew") QueryWrapper<StoreupEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<StoreupEntity> wrapper);
   	

}

