package com.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import cn.hutool.core.bean.BeanUtil;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.mapper.Wrapper;

import javax.persistence.Entity;


/**
 * Mybatis-Plus工具类
 */
public class MPUtil {
	public static final char UNDERLINE = '_';

	
	//mybatis plus allEQ 表达式转换
		public static Map allEQMapPre(Object bean,String pre) {
		   Map<String, Object> map =BeanUtil.beanToMap(bean);
		  return camelToUnderlineMap(map,pre);
	   }

		//mybatis plus allEQ 表达式转换
		public static Map allEQMap(Object bean) {
		   Map<String, Object> map =BeanUtil.beanToMap(bean);
		   return camelToUnderlineMap(map,"");
	   }

		public static QueryWrapper allLikePre(QueryWrapper wrapper,Object bean,String pre) {
			   Map<String, Object> map =BeanUtil.beanToMap(bean);
			   Map result = camelToUnderlineMap(map,pre);
			 
			return genLike(wrapper,result);
		}
	
		public static QueryWrapper allLike(QueryWrapper wrapper,Object bean) {
			  Map result = BeanUtil.beanToMap(bean, true, true);			 
			return genLike(wrapper,result);
		}


	public static QueryWrapper<Entity> genLike(QueryWrapper<Entity> wrapper, Map<String, String> param) {
		Iterator<Map.Entry<String, String>> it = param.entrySet().iterator();
		int i = 0;
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();

			if (value != null) {
				// 构建 like 查询条件
				wrapper.like(key, value);
			}

			if (i > 0) {
				// 在第二次迭代之后调用 or() 方法进行逻辑连接
				wrapper.or();
			}

			i++;
		}
		return wrapper;
	}

		
		public static QueryWrapper likeOrEq(QueryWrapper wrapper,Object bean) {
			  Map result = BeanUtil.beanToMap(bean, true, true);
			return genLikeOrEq(wrapper,result);
		}

	public static <T> QueryWrapper<T> genLikeOrEq(QueryWrapper<T> wrapper, Map<String, Object> param) {
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		if (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			if (entry.getValue().toString().contains("%")) {
				wrapper.like(key, entry.getValue().toString().replace("%", ""));
			} else {
				wrapper.eq(key, entry.getValue());
			}
		}
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			if (entry.getValue().toString().contains("%")) {
				wrapper.and(i -> i.like(key, entry.getValue().toString().replace("%", "")));
			} else {
				wrapper.and(i -> i.eq(key, entry.getValue()));
			}
		}
		return wrapper;
	}



	public static QueryWrapper allEq(QueryWrapper wrapper,Object bean) {
			  Map result = BeanUtil.beanToMap(bean, true, true);			 
			return genEq(wrapper,result);
		}


	public static <T> QueryWrapper<T> genEq(QueryWrapper<T> wrapper, Map<String, Object> param) {
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		int i = 0;
		while (it.hasNext()) {
			if (i > 0) {
				wrapper.and(j -> {
				});
			}
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			wrapper.eq(key, entry.getValue());
			i++;
		}
		return wrapper;
	}

	
	
		public static QueryWrapper between(QueryWrapper wrapper,Map<String, Object> params) {
			for(String key : params.keySet()) {
				String columnName = "";
				if(key.endsWith("_start")) {
					columnName = key.substring(0, key.indexOf("_start"));
					if(StringUtils.isNotBlank(params.get(key).toString())) {
						wrapper.ge(columnName, params.get(key));
					}
				}
				if(key.endsWith("_end")) {
					columnName = key.substring(0, key.indexOf("_end"));
					if(StringUtils.isNotBlank(params.get(key).toString())) {
						wrapper.le(columnName, params.get(key));
					}
				}
			}
			return wrapper;
		}

	public static <T> QueryWrapper<T> sort(QueryWrapper<T> wrapper, Map<String, Object> params) {
		String order = "";
		if (params.get("order") != null && StringUtils.isNotBlank(params.get("order").toString())) {
			order = params.get("order").toString();
		}
		if (params.get("sort") != null && StringUtils.isNotBlank(params.get("sort").toString())) {
			if (order.equalsIgnoreCase("desc")) {
				wrapper.orderByDesc(params.get("sort").toString());
			} else {
				wrapper.orderByAsc(params.get("sort").toString());
			}
		}
		return wrapper;
	}


	
	
	/**
	 * 驼峰格式字符串转换为下划线格式字符串
	 * 
	 * @param param
	 * @return
	 */
	public static String camelToUnderline(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(UNDERLINE);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] ages) {
		System.out.println(camelToUnderline("ABCddfANM"));
	}
	
	public static Map camelToUnderlineMap(Map param, String pre) {

		Map<String, Object> newMap = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = camelToUnderline(key);
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {

				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		return newMap;
	}
}
