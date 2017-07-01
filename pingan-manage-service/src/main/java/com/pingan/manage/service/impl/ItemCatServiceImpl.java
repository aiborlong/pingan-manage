package com.pingan.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pingan.manage.mapper.ItemCatMapper;
import com.pingan.manage.pojo.ItemCat;
import com.pingan.manage.service.ItemCatService;

/**
* Created by xizhao.dai on 2017年6月29日--上午4:37:10
*/
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public List<ItemCat> queryItemCatByParentId(Long parentId) {
		// select * from tb_item_cat where parent_id=? and status=1
		//根据条件查询商品类名
		ItemCat record = new ItemCat();
		record.setParentId(parentId);//设置条件父id
		record.setStatus(1);//设置条件状态，为1，表示正常状态
		return this.itemCatMapper.select(record);
	}
}
