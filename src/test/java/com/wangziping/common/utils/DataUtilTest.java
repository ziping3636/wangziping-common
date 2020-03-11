package com.wangziping.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DataUtilTest {

	@Test
	void test() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String sql = "select * from t_order where create_time>='" + sdf.format(DateUtil.getDateByInitMonth(new Date()))
				+ "' and create_time<='" + sdf.format(DateUtil.getDateByFullMonth(new Date())) + "' ";
		System.out.println(sql);
	}

}
