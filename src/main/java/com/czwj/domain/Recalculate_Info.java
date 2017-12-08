package com.czwj.domain;

public class Recalculate_Info {
	private int id;
	private int recalculate_State;
	private int time_Type;
	private String start_Time;
	private String end_Time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRecalculate_State() {
		return recalculate_State;
	}
	public void setRecalculate_State(int recalculate_State) {
		this.recalculate_State = recalculate_State;
	}
	public int getTime_Type() {
		return time_Type;
	}
	public void setTime_Type(int time_Type) {
		this.time_Type = time_Type;
	}
	public String getStart_Time() {
		return start_Time;
	}
	public void setStart_Time(String start_Time) {
		this.start_Time = start_Time;
	}
	public String getEnd_Time() {
		return end_Time;
	}
	public void setEnd_Time(String end_Time) {
		this.end_Time = end_Time;
	}
	
}
