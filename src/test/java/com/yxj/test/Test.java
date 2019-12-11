package com.yxj.test;

public class Test {
	/**
	 * ����1�����ݴ�������ڻ�ȡ����
	 */
	@org.junit.Test
	public void test01() {
		long age = TestDome.getAge("1997-09-26");
		System.out.println(age);
	}

	/**
	 * ����2�����ݴ���Ĳ�����ȡ�����ڵ��³����ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-01
	 * 00:00:00��
	 */
	@org.junit.Test
	public void test02() {
		String dateByMonthInit = TestDome.getDateByMonthInit("2019-09-19");
		System.out.println(dateByMonthInit);
	}

	/**
	 * 3 :���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30
	 * 23:59:59����ע���´���С�Լ����ꡣ
	 */
	@org.junit.Test
	public void test03() {
		String dateByMonthLast = TestDome.getDateByMonthLast("2019-09-19");
		System.out.println(dateByMonthLast);
	}

	/**
	 * 4.��δ����������컹ʣ������
	 */
	@org.junit.Test
	public void test04() {
		long daysByFuture = TestDome.getDaysByFuture("2020-08-26");
		System.out.println(daysByFuture);
	}

	/**
	 * 5.���ȥ����������ȥ������
	 */
	@org.junit.Test
	public void test05() {
		long daysByDeparted = TestDome.getDaysByDeparted("1998-01-19");
		System.out.println(daysByDeparted);
	}

}
