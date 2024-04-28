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


import com.dao.ShuchengtushuDao;
import com.entity.ShuchengtushuEntity;
import com.service.ShuchengtushuService;
import com.entity.vo.ShuchengtushuVO;
import com.entity.view.ShuchengtushuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

@Service("shuchengtushuService")
public class ShuchengtushuServiceImpl extends ServiceImpl<ShuchengtushuDao, ShuchengtushuEntity> implements ShuchengtushuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuchengtushuEntity> page = this.selectPage(
                new Query<ShuchengtushuEntity>(params).getPage(),
                new EntityWrapper<ShuchengtushuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShuchengtushuEntity> wrapper) {
		  Page<ShuchengtushuView> page =new Query<ShuchengtushuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuchengtushuVO> selectListVO(QueryWrapper<ShuchengtushuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuchengtushuVO selectVO(QueryWrapper<ShuchengtushuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuchengtushuView> selectListView(QueryWrapper<ShuchengtushuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuchengtushuView selectView(QueryWrapper<ShuchengtushuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
