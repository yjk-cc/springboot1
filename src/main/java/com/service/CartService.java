package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.utils.PageUtils;
import com.entity.CartEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CartVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CartView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 购物车表
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface CartService extends IService<CartEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CartVO> selectListVO(QueryWrapper<CartEntity> wrapper);
   	
   	CartVO selectVO(@Param("ew") QueryWrapper<CartEntity> wrapper);
   	
   	List<CartView> selectListView(QueryWrapper<CartEntity> wrapper);
   	
   	CartView selectView(@Param("ew") QueryWrapper<CartEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<CartEntity> wrapper);
   	

}

