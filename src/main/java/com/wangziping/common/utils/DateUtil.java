package com.wangziping.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DataUtil
 * @Description: TODO
 * @author: wangziping
 * @date: 2020年3月11日 下午2:34:56
 */
public class DateUtil {

	public static Date getDateByInitMonth(Date src) {

		Calendar instance = Calendar.getInstance();
		// 用传入的日期初始化日历类
		instance.setTime(src);
		// 设置月份的天为 1
		instance.set(Calendar.DAY_OF_MONTH, 1);
		instance.set(Calendar.HOUR_OF_DAY, 0);
		instance.set(Calendar.MINUTE, 0);
		instance.set(Calendar.SECOND, 0);
		return instance.getTime();
	}

	public static Date getDateByFullMonth(Date src) {
		Calendar instance = Calendar.getInstance();
		// 用传入的日期初始化日历类
		instance.setTime(src);
		// 当前月份 +1
		instance.add(Calendar.MONTH, 1);
		// 日期变为下个月月初
		Date early = getDateByInitMonth(instance.getTime());
		// 用月初再次初始化日历类
		instance.setTime(early);
		// 日期的秒数 -1
		instance.add(Calendar.SECOND, -1);
		return instance.getTime();
	}
}
