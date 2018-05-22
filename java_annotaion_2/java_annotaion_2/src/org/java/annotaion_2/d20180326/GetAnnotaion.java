package org.java.annotaion_2.d20180326;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ȡע��(ʹ�÷��似��)
 * 
 * @author VIC
 *
 */
public class GetAnnotaion {
	
	public static void main(String[] args) {
		// �������
		Person person = new Person();
		// ��ȡperson�����������Ϣ
		Class clz = person.getClass();
		// ��������Ϣ�л�ȡע����Ϣ
		Annotation[] clzAnnotactions = clz.getAnnotations();
		System.out.println("Person��ע������: " + clzAnnotactions.length);
		// ��ȡPerson��ĵ�һ��ע��
		Annotation annotation = clzAnnotactions[0];
		System.out.println("Person��ע������: " + annotation.annotationType());
		// ��ȡPerson��ע���ֵ
		Object[] clzAnnotationValues = getAnnotaionValues(annotation);
		System.out.println("Person��ע��ֵ: " + Arrays.toString(clzAnnotationValues));
		
	}

	private static Object[] getAnnotaionValues(Annotation annotation) {
		List<Object> values = new ArrayList<Object>();
		// ���������ע��
		if(annotation instanceof Details){
			Details details = (Details)annotation;
			values.add(details.value());
			values.add(details.className());
			values.add(Arrays.toString(details.fields()));
		}
		return values.toArray();
	}

}
