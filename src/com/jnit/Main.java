package com.jnit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jnit.bean.ApplicationBeans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Travel t = (Travel) factory.getBean("lotus");
		t.startJourney();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Travel tt = (Travel) context.getBean("lotus");
		tt.startJourney();

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationBeans.class);
		Travel ttt = (Travel) ctx.getBean("lotus");
		ttt.startJourney();
	}

}
