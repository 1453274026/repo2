package org.java.annotaion_2.d20180326.zuoye;

import java.lang.annotation.Annotation;

public class huoqu {

	public static void main(String[] args) {
		
		User user = new User();
		Class t1 = user.getClass();
		Annotation[] t2 = t1.getAnnotations();
		System.out.println("��ȡע������ :" + t2.length);
		
		Annotation t3 = t2[0];
		System.out.println("��ȡ��һ��ע��:" + t3);
	}
}
