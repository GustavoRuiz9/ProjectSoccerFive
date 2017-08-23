package com.soccerFive.beans;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

	@Bean
	public static Player Player() {

		
		return new Player();

	}
	
	@Bean
	public static SoccerField SoccerField() {

		
		return new SoccerField();

	}
	
	@Bean
	public static Reservation Reservation() {

		
		return new Reservation();

	}

}
