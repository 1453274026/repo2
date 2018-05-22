package org.java.annotaion_2.d20180326;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述信息的注解(自定义注解)
 *
 * 自定义注解
 * 1. 每个注解默认继承java.lang.annotation.Annotation接口
 * 2. 每个注解都是对源代码的一种标注或是元数据
 * 
 * @Target: 表示注解使用的地方
 * ElementType.FIELD 表示使用在字段上
 * ElementType.PACKAGE 表示使用在包上
 * ElementType.METHOD 表示使用在方法上
 * ElementType.CONSTRUCTOR 表示使用在构造函数上
 * ElementType.PARAMETER 表示使用在参数上
 * ElementType.LOCAL_VARIABLE 表示使用在变量上
 * ElementType.TYPE 表示使用在类上
 * 
 * @Retention: 表示注解的存在范围或级别或声明周期
 * RetentionPolicy.SOURCE 表示只存在于代码中,编译之后就不存在
 * RetentionPolicy.CLASS 表示存在于字节码中,运行只有就不存在
 * RetentionPolicy.RUNTIME 表示存在于运行中
 * 
 * @Documented: 表示是否可以应用于Javadoc
 * @Inherited: 表示是否可以继承父类注解
 *
 */
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Details {
	
	/*
	 * 一个注解可以拥有多个成员(注解值)，成员声明和接口方法声明类似，这里，我们仅定义了一个成员，
	 * 成员的声明有以下几点限制：
	 * a)   成员以无入参无抛出异常的方式声明，如boolean value(String str)、boolean value() throws Exception等方式是非法的；
	 * b)   可以通过default为成员指定一个默认值，如String level() default "LOW_LEVEL"、int high() default 2是合法的，当然也可以不指定默认值,如果未指定默认值,则在使用时必须传递一个值。
	 * c)   成员类型是受限的，合法的类型包括原始类型及其封装类、String、Class、enums、注解类型，以及上述类型的数组类型。如ForumService value()、List foo()是非法的。
	 * d)   如果注解只有一个成员，则成员名必须取名为value()，在使用时可以忽略成员名和赋值号（=）前提是其他成员有设置默认值，如@Description("使用注解的实例")。注解类拥有多个成员时，如果仅对value成员进行赋值则也可不使用赋值号，如果同时对多个成员进行赋值，则必须使用赋值号，如@DeclareParents (value = "NaiveWaiter", defaultImpl = SmartSeller.class)。
	 * e)   注解类可以没有成员，没有成员的注解称为标识注解，解释程序以标识注解存在与否进行相应的处理；
	 */
	
	String value() default "默认值";
	
	String className() default "";
	
	String[] fields();

}
