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


import com.dao.YonghuDao;
import com.entity.YonghuEntity;
import com.service.YonghuService;
import com.entity.vo.YonghuVO;
import com.entity.view.YonghuView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

@Service("yonghuService")
public abstract class YonghuServiceImpl extends ServiceImpl<YonghuDao, YonghuEntity> implements YonghuService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		int pageNum = Integer.parseInt(params.getOrDefault("pageNum", 1).toString());
		int pageSize = Integer.parseInt(params.getOrDefault("pageSize", 10).toString());

		Page<YonghuEntity> page = new Page<>(pageNum, pageSize);

		QueryWrapper<YonghuEntity> queryWrapper = new QueryWrapper<>();
		// 可根据需要添加查询条件
		// queryWrapper.eq("field", value);

		// 执行分页查询
		IPage<YonghuEntity> resultPage = baseMapper.selectPage(page, queryWrapper);

		return new PageUtils(resultPage.getRecords(), resultPage.getTotal(), resultPage.getSize(), resultPage.getCurrent());
	}

    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<YonghuEntity> wrapper) {
		  Page<YonghuView> page =new Query<YonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuVO> selectListVO(QueryWrapper<YonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuVO selectVO(QueryWrapper<YonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuView> selectListView(QueryWrapper<YonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuView selectView(QueryWrapper<YonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
