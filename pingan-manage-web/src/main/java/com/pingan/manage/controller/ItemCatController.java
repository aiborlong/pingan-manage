package com.pingan.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pingan.manage.pojo.ItemCat;
import com.pingan.manage.service.ItemCatService;


/**
 * Created by xizhao.dai on 2017年6月29日--上午4:08:32
 */
@Controller
@RequestMapping(value="item/cat")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;

	// 查询商品类目
	@RequestMapping(method = RequestMethod.GET,value="/list")
	public ResponseEntity<List<ItemCat>> queryItemCatByParentId(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		// 查询一级目录
		try {
			System.out.println(parentId);
			List<ItemCat> itemCats = this.itemCatService.queryItemCatByParentId(parentId);
			if (itemCats==null || itemCats.isEmpty()) {
				//没有查询到数据，返回状态码404
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}else {
				//return ResponseEntity.status(HttpStatus.OK).body(itemCats);
				return ResponseEntity.ok(itemCats);//只适合返回状态码是200，和上面等价
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
}
