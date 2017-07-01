package com.pingan.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xizhao.dai on 2017年6月28日--上午2:58:25
 */
@Controller
@RequestMapping(value = "page")
public class PageController {
	/**
	 * 通用的页面跳转方法
	 * @param pageName
	 * @return pageName
	 */
	@RequestMapping(value="{pageName}")
	public String toPage(@PathVariable("pageName") String pageName) {
		return pageName;
	}
}
