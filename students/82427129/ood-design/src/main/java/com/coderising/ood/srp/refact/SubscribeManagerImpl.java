package com.coderising.ood.srp.refact;

import java.util.ArrayList;
import java.util.List;

public class SubscribeManagerImpl implements SubscribeManager {

	private String sql = "Select name from subscriptions "
			+ "where product_id= ? and send_mail=1 ";

	@Override
	public List<User> getSubUserByProduct(Product product) {
		ArrayList<Product> products = new ArrayList<>();
		return getSubUserByProduct(products);
	}

	@Override
	public List<User> getSubUserByProduct(List<Product> products) {
		ArrayList<String> paramList = new ArrayList<String>();
		for (Product product : products) {
			paramList.add(product.getProductID());
		}
		return DBUtil.query(sql, paramList);
	}

}
