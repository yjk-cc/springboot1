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


import com.dao.CartDao;
import com.entity.CartEntity;
import com.service.CartService;
import com.entity.vo.CartVO;
import com.entity.view.CartView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("cartService")
public abstract class CartServiceImpl extends ServiceImpl<CartDao, CartEntity> implements CartService {


/*
	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<CartEntity> page = new Page<>(Long.parseLong(params.get("page").toString()), Long.parseLong(params.get("limit").toString()));
		EntityWrapper<CartEntity> wrapper = new EntityWrapper<>();
		// 设置查询条件...
		List<CartEntity> list = this.selectPage(page, wrapper).getRecords();
		long totalCount = page.getTotal();
		long pageSize = page.getSize();
		long currPage = page.getCurrent();
		return new PageUtils(list, totalCount, pageSize, currPage);
	}
  */
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<CartEntity> wrapper) {
		  Page<CartEntity> page =new Query<CartEntity>(params).getPage();
	       // page.setRecords(baseMapper.selectListView(page,wrapper));
		    page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CartVO> selectListVO(QueryWrapper<CartEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CartVO selectVO(QueryWrapper<CartEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CartView> selectListView(QueryWrapper<CartEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CartView selectView(QueryWrapper<CartEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
