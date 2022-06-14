package com.xworkz.di.bean;

import javax.annotation.PostConstruct;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Franchise {

	private String name;//Value
	@Autowired
	private BigBasket basket;// ref
	@Autowired
	private PooledPBEStringEncryptor encryptor;

	public Franchise(@Value("Vignesh") String name) {
		System.out.println("running const of Franchise");
		this.name = name;
		
	}

	@PostConstruct
	public void displayVendorDetails() {
		System.out.println("running display vendor details");
		System.out.println(this.name);
		System.out.println(this.basket.getCity());
		System.out.println(this.basket.getId());
		System.out.println(encryptor.encrypt("xworkz"));
		System.out.println(encryptor.decrypt("KoC+5b4vDZXY4W0gpIXjeA=="));
	}
	
	@PostConstruct
	public void display()
	{
		System.out.println("running display");
	}

}
