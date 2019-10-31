package com.imooc.handler;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 003 on 2018/7/11.
 */
public class MyHandler implements Controller {


	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		//装载模型数据和逻辑视图
		ModelAndView modelAndView=new ModelAndView();
		//添加模型数据
		modelAndView.addObject("name","Tom");
		//添加逻辑视图
		modelAndView.setViewName("show");
		return modelAndView;
	}
}
