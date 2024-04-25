package com.entity.view;

import com.entity.ShuchengtushuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 书城图书
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-31 00:05:03
 */
@TableName("shuchengtushu")
public class ShuchengtushuView  extends ShuchengtushuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuchengtushuView(){
	}
 
 	public ShuchengtushuView(ShuchengtushuEntity shuchengtushuEntity){
 	try {
			BeanUtils.copyProperties(this, shuchengtushuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
