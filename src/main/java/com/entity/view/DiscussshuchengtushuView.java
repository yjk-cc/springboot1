package com.entity.view;

import com.entity.DiscussshuchengtushuEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 书城图书评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-31 00:05:04
 */
@TableName("discussshuchengtushu")
public class DiscussshuchengtushuView  extends DiscussshuchengtushuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshuchengtushuView(){
	}
 
 	public DiscussshuchengtushuView(DiscussshuchengtushuEntity discussshuchengtushuEntity){
 	try {
			BeanUtils.copyProperties(this, discussshuchengtushuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
