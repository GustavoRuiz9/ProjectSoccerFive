package com.soccerFive.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class Player {
	
	
	
	private String id;
	@Value("player_deafault")
	private String name;
	private String last_name, adress, number_phone;
	private Date date_ini;
	
	
	
	public Player(String id, String name, String last_name, String adress, String number_phone, Date date_ini) {
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.adress = adress;
		this.number_phone = number_phone;
		this.date_ini = date_ini;

	}
	
	public Player(String id) {
		this.id = id;
	}
	
	public Player() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNumber_phone() {
		return number_phone;
	}
	public void setNumber_phone(String number_phone) {
		this.number_phone = number_phone;
	}
	public Date getDate_ini() {
		return date_ini;
	}
	public void setDate_ini(Date date_ini) {
		this.date_ini = date_ini;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", last_name=" + last_name + ", adress=" + adress
				+ ", number_phone=" + number_phone + ", date_ini=" + date_ini + "]";
	}

	
	
	

}
