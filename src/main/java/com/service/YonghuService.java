package com.service;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户
 *
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
public interface YonghuService extends IService<YonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuVO> selectListVO(QueryWrapper<YonghuEntity> wrapper);
   	
   	YonghuVO selectVO(@Param("ew") QueryWrapper<YonghuEntity> wrapper);
   	
   	List<YonghuView> selectListView(QueryWrapper<YonghuEntity> wrapper);
   	
   	YonghuView selectView(@Param("ew") QueryWrapper<YonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<YonghuEntity> wrapper);


    YonghuEntity selectOne(QueryWrapper<YonghuEntity> zhanghao);

	void insert(YonghuEntity yonghu);

	YonghuEntity selectById(Long id);

	boolean updateById(YonghuEntity user);

	void deleteBatchIds(List<Long> asList);
}

