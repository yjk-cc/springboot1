package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.utils.PageUtils;
import com.entity.AddressEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AddressVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AddressView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 地址
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface AddressService extends IService<AddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AddressVO> selectListVO(QueryWrapper<AddressEntity> wrapper);
   	
   	AddressVO selectVO(@Param("ew") QueryWrapper<AddressEntity> wrapper);
   	
   	List<AddressView> selectListView(QueryWrapper<AddressEntity> wrapper);
   	
   	AddressView selectView(@Param("ew") QueryWrapper<AddressEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<AddressEntity> wrapper);
   	

}

