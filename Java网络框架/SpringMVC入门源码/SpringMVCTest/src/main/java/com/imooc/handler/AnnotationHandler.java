package com.imooc.handler;

import com.imooc.entity.Goods;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by 003 on 2018/7/11.
 */
@Controller
public class AnnotationHandler {


	/**
	 * 业务方法：ModelAndView完成数据的传递，视图的解析
	 */
	@RequestMapping("/modelAndViewTest")
	public ModelAndView modelAndViewTest(){
		//创建ModelAndView对象
		ModelAndView modelAndView=new ModelAndView();
		//填充模型数据
		modelAndView.addObject("name","Tom");
		//设置逻辑视图
		modelAndView.setViewName("show");
		return modelAndView;
	}

	/**
	 * 业务方法：Map传值，String进行视图解析
	 */
	@RequestMapping("/MapTest")
	public String MapTest(Map<String,String> map){
		//填充模型数据
		map.put("name","Cat");
		//设置逻辑视图
		return "show";
	}


	/**
	 * 添加商品并展示
	 */
	@RequestMapping("/addGoods")
	public ModelAndView addGoods(Goods goods){
		System.out.println(goods.getName()+"---"+goods.getPrice());
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("goods",goods);
		modelAndView.setViewName("show");
		return modelAndView;
	}
}
