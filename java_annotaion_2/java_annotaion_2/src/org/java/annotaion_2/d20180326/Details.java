package org.java.annotaion_2.d20180326;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ������Ϣ��ע��(�Զ���ע��)
 *
 * �Զ���ע��
 * 1. ÿ��ע��Ĭ�ϼ̳�java.lang.annotation.Annotation�ӿ�
 * 2. ÿ��ע�ⶼ�Ƕ�Դ�����һ�ֱ�ע����Ԫ����
 * 
 * @Target: ��ʾע��ʹ�õĵط�
 * ElementType.FIELD ��ʾʹ�����ֶ���
 * ElementType.PACKAGE ��ʾʹ���ڰ���
 * ElementType.METHOD ��ʾʹ���ڷ�����
 * ElementType.CONSTRUCTOR ��ʾʹ���ڹ��캯����
 * ElementType.PARAMETER ��ʾʹ���ڲ�����
 * ElementType.LOCAL_VARIABLE ��ʾʹ���ڱ�����
 * ElementType.TYPE ��ʾʹ��������
 * 
 * @Retention: ��ʾע��Ĵ��ڷ�Χ�򼶱����������
 * RetentionPolicy.SOURCE ��ʾֻ�����ڴ�����,����֮��Ͳ�����
 * RetentionPolicy.CLASS ��ʾ�������ֽ�����,����ֻ�оͲ�����
 * RetentionPolicy.RUNTIME ��ʾ������������
 * 
 * @Documented: ��ʾ�Ƿ����Ӧ����Javadoc
 * @Inherited: ��ʾ�Ƿ���Լ̳и���ע��
 *
 */
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Details {
	
	/*
	 * һ��ע�����ӵ�ж����Ա(ע��ֵ)����Ա�����ͽӿڷ����������ƣ�������ǽ�������һ����Ա��
	 * ��Ա�����������¼������ƣ�
	 * a)   ��Ա����������׳��쳣�ķ�ʽ��������boolean value(String str)��boolean value() throws Exception�ȷ�ʽ�ǷǷ��ģ�
	 * b)   ����ͨ��defaultΪ��Աָ��һ��Ĭ��ֵ����String level() default "LOW_LEVEL"��int high() default 2�ǺϷ��ģ���ȻҲ���Բ�ָ��Ĭ��ֵ,���δָ��Ĭ��ֵ,����ʹ��ʱ���봫��һ��ֵ��
	 * c)   ��Ա���������޵ģ��Ϸ������Ͱ���ԭʼ���ͼ����װ�ࡢString��Class��enums��ע�����ͣ��Լ��������͵��������͡���ForumService value()��List foo()�ǷǷ��ġ�
	 * d)   ���ע��ֻ��һ����Ա�����Ա������ȡ��Ϊvalue()����ʹ��ʱ���Ժ��Գ�Ա���͸�ֵ�ţ�=��ǰ����������Ա������Ĭ��ֵ����@Description("ʹ��ע���ʵ��")��ע����ӵ�ж����Աʱ���������value��Ա���и�ֵ��Ҳ�ɲ�ʹ�ø�ֵ�ţ����ͬʱ�Զ����Ա���и�ֵ�������ʹ�ø�ֵ�ţ���@DeclareParents (value = "NaiveWaiter", defaultImpl = SmartSeller.class)��
	 * e)   ע�������û�г�Ա��û�г�Ա��ע���Ϊ��ʶע�⣬���ͳ����Ա�ʶע�������������Ӧ�Ĵ���
	 */
	
	String value() default "Ĭ��ֵ";
	
	String className() default "";
	
	String[] fields();

}
