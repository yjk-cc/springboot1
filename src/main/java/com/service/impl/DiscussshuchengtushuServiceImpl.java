package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshuchengtushuDao;
import com.entity.DiscussshuchengtushuEntity;
import com.service.DiscussshuchengtushuService;
import com.entity.vo.DiscussshuchengtushuVO;
import com.entity.view.DiscussshuchengtushuView;

@Service("discussshuchengtushuService")
public class DiscussshuchengtushuServiceImpl extends ServiceImpl<DiscussshuchengtushuDao, DiscussshuchengtushuEntity> implements DiscussshuchengtushuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshuchengtushuEntity> page = this.selectPage(
                new Query<DiscussshuchengtushuEntity>(params).getPage(),
                new EntityWrapper<DiscussshuchengtushuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuchengtushuEntity> wrapper) {
		  Page<DiscussshuchengtushuView> page =new Query<DiscussshuchengtushuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshuchengtushuVO> selectListVO(Wrapper<DiscussshuchengtushuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshuchengtushuVO selectVO(Wrapper<DiscussshuchengtushuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshuchengtushuView> selectListView(Wrapper<DiscussshuchengtushuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshuchengtushuView selectView(Wrapper<DiscussshuchengtushuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}