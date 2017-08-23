package com.soccerFive.soccerFive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soccerFive.beans.AppConfig;
import com.soccerFive.beans.AppConfig2;
import com.soccerFive.beans.Reservation;
import com.soccerFive.beans.SoccerField;
import com.soccerFive.beans.Player;
import com.soccerFive.beans.Profile;

public class App {
	
	public static void main (String args[]) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/soccerFive/xml/beans.xml");
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		Profile pr = (Profile)appContext.getBean("profile");

		SoccerField sf = (SoccerField)appContext.getBean("field_sc");
		Reservation rs = (Reservation)appContext.getBean("reservation");
	

	

		((ConfigurableApplicationContext) appContext).close(); 
	}

}
