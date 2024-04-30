package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;


import com.utils.PageUtils;
import com.utils.Query;


import com.dao.StoreupDao;
import com.entity.StoreupEntity;
import com.service.StoreupService;
import com.entity.vo.StoreupVO;
import com.entity.view.StoreupView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

@Service("storeupService")
public class StoreupServiceImpl extends ServiceImpl<StoreupDao, StoreupEntity> implements StoreupService {


    @Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<StoreupEntity> page = new Page<>(Long.parseLong(params.getOrDefault("page", "1").toString()), Long.parseLong(params.getOrDefault("limit", "10").toString()));
		page = baseMapper.selectPage(page, null);
		return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<StoreupEntity> wrapper) {
		  Page<StoreupEntity> page =new Query<StoreupEntity>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<StoreupVO> selectListVO(QueryWrapper<StoreupEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public StoreupVO selectVO(QueryWrapper<StoreupEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<StoreupView> selectListView(QueryWrapper<StoreupEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public StoreupView selectView(QueryWrapper<StoreupEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
