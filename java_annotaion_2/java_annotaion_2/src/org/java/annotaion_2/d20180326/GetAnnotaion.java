package org.java.annotaion_2.d20180326;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 获取注解(使用反射技术)
 * 
 * @author VIC
 *
 */
public class GetAnnotaion {
	
	public static void main(String[] args) {
		// 定义对象
		Person person = new Person();
		// 获取person对象的类型信息
		Class clz = person.getClass();
		// 从类型信息中获取注解信息
		Annotation[] clzAnnotactions = clz.getAnnotations();
		System.out.println("Person类注解数量: " + clzAnnotactions.length);
		// 获取Person类的第一个注解
		Annotation annotation = clzAnnotactions[0];
		System.out.println("Person类注解类型: " + annotation.annotationType());
		// 获取Person类注解的值
		Object[] clzAnnotationValues = getAnnotaionValues(annotation);
		System.out.println("Person类注解值: " + Arrays.toString(clzAnnotationValues));
		
	}

	private static Object[] getAnnotaionValues(Annotation annotation) {
		List<Object> values = new ArrayList<Object>();
		// 如果是描述注解
		if(annotation instanceof Details){
			Details details = (Details)annotation;
			values.add(details.value());
			values.add(details.className());
			values.add(Arrays.toString(details.fields()));
		}
		return values.toArray();
	}

}
