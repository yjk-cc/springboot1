package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.OrdersEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.OrdersVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.OrdersView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * 订单
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface OrdersService extends IService<OrdersEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<OrdersVO> selectListVO(QueryWrapper<OrdersEntity> wrapper);
   	
   	OrdersVO selectVO(@Param("ew") QueryWrapper<OrdersEntity> wrapper);
   	
   	List<OrdersView> selectListView(QueryWrapper<OrdersEntity> wrapper);
   	
   	OrdersView selectView(@Param("ew") QueryWrapper<OrdersEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<OrdersEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params, QueryWrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, QueryWrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params, QueryWrapper<OrdersEntity> wrapper);
}

