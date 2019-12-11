package com.yxj.test;

public class Test {
	/**
	 * 方法1：根据传入的日期获取年龄
	 */
	@org.junit.Test
	public void test01() {
		long age = TestDome.getAge("1997-09-26");
		System.out.println(age);
	}

	/**
	 * 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01
	 * 00:00:00”
	 */
	@org.junit.Test
	public void test02() {
		String dateByMonthInit = TestDome.getDateByMonthInit("2019-09-19");
		System.out.println(dateByMonthInit);
	}

	/**
	 * 3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30
	 * 23:59:59”，注意月大月小以及闰年。
	 */
	@org.junit.Test
	public void test03() {
		String dateByMonthLast = TestDome.getDateByMonthLast("2019-09-19");
		System.out.println(dateByMonthLast);
	}

	/**
	 * 4.求未来日期离今天还剩的天数
	 */
	@org.junit.Test
	public void test04() {
		long daysByFuture = TestDome.getDaysByFuture("2020-08-26");
		System.out.println(daysByFuture);
	}

	/**
	 * 5.求过去日期离今天过去的天数
	 */
	@org.junit.Test
	public void test05() {
		long daysByDeparted = TestDome.getDaysByDeparted("1998-01-19");
		System.out.println(daysByDeparted);
	}

}
