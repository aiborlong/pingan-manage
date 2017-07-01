package com.pingan.manage.service;

import java.util.List;

import com.pingan.manage.pojo.ItemCat;

/**
* Created by xizhao.dai on 2017年6月29日--上午4:22:41
*/

public interface ItemCatService {

	public List<ItemCat> queryItemCatByParentId(Long parentId);

}
