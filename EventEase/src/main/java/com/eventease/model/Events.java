package com.eventease.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Events {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long evId;
	private String evName;
	private String comName;
	private String date;
	private String time;
	private String venue;
	private String clgName;
	private boolean appPrin;
	private boolean appDean;
	private boolean appHod;
	private boolean appMentor;
	private String comment;
	public long getEvId() {
		return evId;
	}
	public void setEvId(long evId) {
		this.evId = evId;
	}
	public String getEvName() {
		return evName;
	}
	public void setEvName(String evName) {
		this.evName = evName;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public boolean isAppPrin() {
		return appPrin;
	}
	public void setAppPrin(boolean appPrin) {
		this.appPrin = appPrin;
	}
	public boolean isAppDean() {
		return appDean;
	}
	public void setAppDean(boolean appDean) {
		this.appDean = appDean;
	}
	public boolean isAppHod() {
		return appHod;
	}
	public void setAppHod(boolean appHod) {
		this.appHod = appHod;
	}
	public boolean isAppMentor() {
		return appMentor;
	}
	public void setAppMentor(boolean appMentor) {
		this.appMentor = appMentor;
	}
	public String isComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Events [evId=" + evId + ", evName=" + evName + ", comName=" + comName + ", date=" + date + ", time="
				+ time + ", venue=" + venue + ", clgName=" + clgName + ", appPrin=" + appPrin + ", appDean=" + appDean
				+ ", appHod=" + appHod + ", appMentor=" + appMentor + ", comment=" + comment + "]";
	}
	public Events(long evId, String evName, String comName, String date, String time, String venue, String clgName,
			boolean appPrin, boolean appDean, boolean appHod, boolean appMentor, String comment) {
		super();
		this.evId = evId;
		this.evName = evName;
		this.comName = comName;
		this.date = date;
		this.time = time;
		this.venue = venue;
		this.clgName = clgName;
		this.appPrin = appPrin;
		this.appDean = appDean;
		this.appHod = appHod;
		this.appMentor = appMentor;
		this.comment = comment;
	}
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
