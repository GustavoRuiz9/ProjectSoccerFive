package com.soccerFive.beans;

import org.springframework.beans.factory.annotation.Value;

public class SoccerField {

	private String id;
	@Value (value="active")
	private String state;
	private double vr_hour;
	private byte ima[];
	
	public SoccerField(String id, String state, double vr_hour, byte[] ima) {
		this.id = id;
		this.state = state; //active - inactive
		this.vr_hour = vr_hour;
		this.ima = ima;
	}

	public SoccerField() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getVr_hour() {
		return vr_hour;
	}

	public void setVr_hour(double vr_hour) {
		this.vr_hour = vr_hour;
	}

	public byte[] getIma() {
		return ima;
	}

	public void setIma(byte[] ima) {
		this.ima = ima;
	}

	
}
