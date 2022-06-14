package com.xworkz.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class BigBasket {

	@Value("${test}")
	private String city;
	@Value("456")
	private int id;

	public BigBasket() {
		System.out.println("running default const of BigBasket");
	}

}
