package com.coderising.ood.srp.refact;

import java.util.List;

/**
 * 商品变动通知接口
 *
 */
public interface ProductChangeListener {
	/*
	 * 获取变动了的商品列表
	 */
	List<Product> getChangedProducts();
	
	/*
	 * 获取商品变动信息，目前是使用的email方式
	 */
	EmailObj getChangedInfomation();
}
