package com.soccerFive.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class Reservation {

	
	private String id;
	private Date date_reservation;
	private int hour_ini;
	private int hour_end;
	private Player player;
	private SoccerField field_sc;
	private String state; //pend - confirm - cancel - play - finish 
	private double cost;
	
	
	public Reservation(String id, Date date_reservation, int hour_ini, int hour_end, Player player, SoccerField field_sc, String state, double cost) {
		this.id = id;
		this.date_reservation = date_reservation;
		this.hour_ini = hour_ini;
		this.hour_end = hour_end;
		this.player = player;
		this.field_sc = field_sc;
		this.state = state; //pend - cancel - finish 
		this.cost = cost;
	}
	
	public Reservation() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate_reservation() {
		return date_reservation;
	}
	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}
	public int getHour_ini() {
		return hour_ini;
	}
	public void setHour_ini(int hour_ini) {
		this.hour_ini = hour_ini;
	}
	public int getHour_end() {
		return hour_end;
	}
	public void setHour_end(int hour_end) {
		this.hour_end = hour_end;
	}
	public SoccerField getField_sc() {
		return field_sc;
	}
	public void setField_sc(SoccerField field_sc) {
		this.field_sc = field_sc;
	}

	public Player getUser() {
		return player;
	}

	public void setUser(Player player) {
		this.player = player;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
}
