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
import com.dao.AddressDao;
import com.entity.AddressEntity;
import com.service.AddressService;
import com.entity.vo.AddressVO;
import com.entity.view.AddressView;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



public class AddressServiceImpl extends ServiceImpl<AddressDao, AddressEntity> implements AddressService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		int pageNum = Integer.parseInt(params.getOrDefault("pageNum", 1).toString());
		int pageSize = Integer.parseInt(params.getOrDefault("pageSize", 10).toString());

		Page<AddressEntity> page = new Page<>(pageNum, pageSize);

		QueryWrapper<AddressEntity> wrapper = new QueryWrapper<>();
		// 可根据需要添加查询条件
		// wrapper.eq("field", value);

		// 执行分页查询
		IPage<AddressEntity> resultPage = baseMapper.selectPage(page, wrapper);

		return new PageUtils(resultPage.getRecords(), resultPage.getTotal(), resultPage.getSize(), resultPage.getCurrent());
	}

    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<AddressEntity> wrapper) {
		  Page<AddressEntity> page =new Query<AddressEntity>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<AddressVO> selectListVO(QueryWrapper<AddressEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AddressVO selectVO(QueryWrapper<AddressEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AddressView> selectListView(QueryWrapper<AddressEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AddressView selectView(QueryWrapper<AddressEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
