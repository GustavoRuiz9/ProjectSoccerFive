package com.soccerFive.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public static Player player(){
		
		return new Player();
		
	}

	
	@Bean
	public static SoccerField soccerfield() {

		
		return new SoccerField();

	}
	
	@Bean
	public static Reservation reservation() {

		
		return new Reservation();

	}
	
	
	@Bean
	public static Profile profile() {

		
		return new Profile();

	}
	
	@Bean
	public static User user() {

		
		return new User();

	}
	
}
