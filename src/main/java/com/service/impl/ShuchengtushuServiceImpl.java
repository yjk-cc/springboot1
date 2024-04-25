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


import com.dao.ShuchengtushuDao;
import com.entity.ShuchengtushuEntity;
import com.service.ShuchengtushuService;
import com.entity.vo.ShuchengtushuVO;
import com.entity.view.ShuchengtushuView;

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
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuchengtushuEntity> wrapper) {
		  Page<ShuchengtushuView> page =new Query<ShuchengtushuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuchengtushuVO> selectListVO(Wrapper<ShuchengtushuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuchengtushuVO selectVO(Wrapper<ShuchengtushuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuchengtushuView> selectListView(Wrapper<ShuchengtushuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuchengtushuView selectView(Wrapper<ShuchengtushuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
