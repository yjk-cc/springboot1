package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

//import com.baomidou.mybatisplus.mapper.Wrapper;
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.baomidou.mybatisplus.plugins.Page;
//import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TushuleixingDao;
import com.entity.TushuleixingEntity;
import com.service.TushuleixingService;
import com.entity.vo.TushuleixingVO;
import com.entity.view.TushuleixingView;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

@Service("tushuleixingService")
public class TushuleixingServiceImpl extends ServiceImpl<TushuleixingDao, TushuleixingEntity> implements TushuleixingService {
	
	
    @Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<TushuleixingEntity> page = new Page<>(Long.parseLong(params.getOrDefault("page", "1").toString()), Long.parseLong(params.getOrDefault("limit", "10").toString()));
		page = baseMapper.selectPage(page, new QueryWrapper<TushuleixingEntity>());
		return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<TushuleixingEntity> wrapper) {
		  Page<TushuleixingEntity> page =new Query<TushuleixingEntity>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuleixingVO> selectListVO(QueryWrapper<TushuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuleixingVO selectVO(QueryWrapper<TushuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuleixingView> selectListView(QueryWrapper<TushuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuleixingView selectView(QueryWrapper<TushuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
