package com.coderising.ood.srp;

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
	public static List<Map<String, Object>> query(String sql) {

		List<Map<String, Object>> userList = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			Map<String, Object> userInfo = new HashMap<>();
			userInfo.put("NAME", "User" + i);
			userInfo.put("EMAIL", "aa" + i + "@bb.com");
			userList.add(userInfo);
		}

		return userList;
	}
}
