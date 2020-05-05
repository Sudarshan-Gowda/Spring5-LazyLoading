package com.star.sud.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.star.sud.bean.TechnologyDetails;
import com.star.sud.service.ITechnologyService;
import com.star.sud.service.TechnologyServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
			System.out.println("Application Context Factory Initialzed!");
			ITechnologyService bean = context.getBean(TechnologyServiceImpl.class);
			TechnologyDetails technologyDetails = bean.getTechnologyDetails();
			System.out.println(technologyDetails);

			((ConfigurableApplicationContext) context).close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
