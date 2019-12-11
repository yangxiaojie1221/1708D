package com.yxj.test;

import java.util.Date;

/**
 * 测试
 * 
 * @author Yang Xiaojie
 *
 */
public class TestDome {
	/**
	 * 方法1：根据传入的日期获取年龄
	 * 
	 * @param src
	 * @return
	 */
	public static long getAge(String date) {
		long years = DateUtils.getYears(date);
		return years;

		// TODO
	}

	/**
	 * 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01
	 * 00:00:00” //示例:
	 * 
	 * @param src
	 * @return
	 */
	public static String getDateByMonthInit(String date) {
		String dateByMonthInit = DateUtils.getDateByMonthInit(date);
		return dateByMonthInit;

	}

	/**
	 * 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30
	 * 23:59:59”，注意月大月小以及闰年。 //示例:
	 * 
	 * @param src
	 * @return
	 */
	public static String getDateByMonthLast(String date) {
		String dateByMonthLast = DateUtils.getDateByMonthLast(date);
		return dateByMonthLast;
		// TODO
	}

	/**
	 * 方法4：求未来日期离今天还剩的天数 //示例:
	 * 
	 * @param future
	 * @return
	 */
	public static long getDaysByFuture(String future) {
		long daysByDeparted = DateUtils.getDaysByDeparted(future);
		return daysByDeparted;
	}

	/**
	 * 方法5：求过去日期离今天过去的天数 //示例:
	 * 
	 * @param departed
	 * @return
	 */
	public static long getDaysByDeparted(String departed) {
		long daysByDeparted = DateUtils.getDaysByDeparted(departed);
		return daysByDeparted;
	}

}
