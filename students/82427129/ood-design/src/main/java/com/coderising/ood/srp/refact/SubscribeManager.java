package com.coderising.ood.srp.refact;

import java.util.List;

import com.coderising.ood.srp.refact.entity.Product;
import com.coderising.ood.srp.refact.entity.User;

/**
 * 订阅管理
 *
 */
public interface SubscribeManager {

	public List<User> getSubUserByProduct(Product product);
	
	public List<User> getSubUserByProduct(List<Product> products);
}
