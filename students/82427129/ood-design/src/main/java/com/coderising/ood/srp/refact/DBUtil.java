package com.coderising.ood.srp.refact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {

	/**
	 * 应该从数据库读， 但是简化为直接生成。
	 * 
	 * @param sql
	 * @return
	 */
	public static List<User> query(String sql , List<String> param) {

		List<User> userList = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			User user = new User();
			user.setUserID("i");
			user.setUserName("User" + i);
			user.setEmailAddress("aa" + i + "@bb.com");
			userList.add(user);
		}

		return userList;
	}
}
