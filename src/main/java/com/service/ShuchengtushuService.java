package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuchengtushuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuchengtushuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuchengtushuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 书城图书
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface ShuchengtushuService extends IService<ShuchengtushuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuchengtushuVO> selectListVO(Wrapper<ShuchengtushuEntity> wrapper);
   	
   	ShuchengtushuVO selectVO(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
   	
   	List<ShuchengtushuView> selectListView(Wrapper<ShuchengtushuEntity> wrapper);
   	
   	ShuchengtushuView selectView(@Param("ew") Wrapper<ShuchengtushuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ShuchengtushuEntity> wrapper);
   	

}

