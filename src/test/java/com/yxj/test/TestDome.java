package com.yxj.test;

import java.util.Date;

/**
 * ����
 * 
 * @author Yang Xiaojie
 *
 */
public class TestDome {
	/**
	 * ����1�����ݴ�������ڻ�ȡ����
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
	 * ����2�����ݴ���Ĳ�����ȡ�����ڵ��³����ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-01
	 * 00:00:00�� //ʾ��:
	 * 
	 * @param src
	 * @return
	 */
	public static String getDateByMonthInit(String date) {
		String dateByMonthInit = DateUtils.getDateByMonthInit(date);
		return dateByMonthInit;

	}

	/**
	 * ����3 :���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30
	 * 23:59:59����ע���´���С�Լ����ꡣ //ʾ��:
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
	 * ����4����δ����������컹ʣ������ //ʾ��:
	 * 
	 * @param future
	 * @return
	 */
	public static long getDaysByFuture(String future) {
		long daysByDeparted = DateUtils.getDaysByDeparted(future);
		return daysByDeparted;
	}

	/**
	 * ����5�����ȥ����������ȥ������ //ʾ��:
	 * 
	 * @param departed
	 * @return
	 */
	public static long getDaysByDeparted(String departed) {
		long daysByDeparted = DateUtils.getDaysByDeparted(departed);
		return daysByDeparted;
	}

}
