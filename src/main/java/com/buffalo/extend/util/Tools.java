package com.buffalo.extend.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Tools {
	
	/** 
	 * 将对象转换成json字符串
	 * @param object 需要转换的对象
	 * @return 转换后的json字符串，如果不能转换则返回空字符串
	 */
	public static String getJsonString(Object object) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
		
	}
	
}
