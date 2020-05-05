package com.star.sud.service;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.star.sud.bean.TechnologyDetails;

@Lazy
@Service
public class TechnologyServiceImpl implements ITechnologyService {

	@Override
	public TechnologyDetails getTechnologyDetails() {
		try {
			TechnologyDetails details = new TechnologyDetails();
			details.setTechId(1);
			details.setTechName("Java");
			details.setTechDescription("Welcome to Java Learniners!");
			return details;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * @PostConstruct annotation to detect when bean is created.
	 */
	@PostConstruct
	public void onInit() {
		System.out.println("TechnologyServiceImpl bean is created.");
	}

}
