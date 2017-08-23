package com.soccerFive.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Profile implements InitializingBean, DisposableBean {
	
	private	Player player;
	private String password;
	private int accumulated_hours;
	private byte [] img;
	
	/*@PostConstruct
	private void init (){
		System.out.println("antes de iniciar el bean");
	}
	
	@PreDestroy
	private void destroy (){
		System.out.println("antes de destruir el bean");
	}*/
	
	public Profile(Player player, String pass, int accumulated_hours, byte[] img) {
		this.player = player;
		this.password = pass;
		this.accumulated_hours = accumulated_hours;
		this.img = img;
	}
	
	public Profile(){
		
	}
	
	public Profile(Player p, String pass, int acum_hours){
		this.player = p;
		this.password = pass;
		this.accumulated_hours = acum_hours;
	}
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccumulated_hours() {
		return accumulated_hours;
	}
	public void setAccumulated_hours(int accumulated_hours) {
		this.accumulated_hours = accumulated_hours;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("antes de destruir el bean");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("antes de iniciar el bean");
		
	}

	

	
	
}
