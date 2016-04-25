package com.buffalo.extend.util;

/**
 * @author ChrisChen
 * 用于放置静态资源的类
 */
public class R {
	
	/**
	 * @author ChrisChen
	 * 静态视图名称字符串
	 */
	public static class Views {
		public static final String INDEX = "index";  //首页
		public static final String LOGIN = "login"; //登录页面
		public static final String LOGON = "logon"; //注册页面
		public static final String ERROR = "error";  //错误页面
	}
	
	/**
	 * @author ChrisChen
	 * 用于返回执行某些动作的动作命令字符串
	 */
	public static class Actions {
		
		private static final String REDIRECT = "redirect:/";
		private static final String FORWARD  = "forward:/";
		
		/**
		 * @param 要重定向到的地址
		 * @return 重定向完整命令字符串
		 */
		public static String redirect(String url) {
			return Actions.REDIRECT + url;
		}
		
		/**
		 * @param 要转发到的地址
		 * @return 转发完整命令字符串
		 */
		public static String forward(String url) {
			return Actions.FORWARD + url;
		}
		
	}
	
}
