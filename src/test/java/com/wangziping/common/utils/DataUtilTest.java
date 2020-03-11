package com.wangziping.common.utils;

import java.util.Date;

import org.junit.jupiter.api.Test;

class DataUtilTest {

	@Test
	void test() {
		String sql = "select * from t_order where create_time>='" + DateUtil.getDateByInitMonth(new Date())
				+ "' and create_time<='" + DateUtil.getDateByFullMonth(new Date()) + "' ";
		System.out.println(sql);
	}

}
