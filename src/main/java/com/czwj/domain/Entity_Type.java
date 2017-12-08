package com.czwj.domain;

public class Entity_Type {
	private int id;
	private int entityTypeId;
	private String entityTypeName;
	private int entityTypeOrder;
	private int entityTypeState;
	private String entityTypeRemark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEntityTypeId() {
		return entityTypeId;
	}
	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}
	public String getEntityTypeName() {
		return entityTypeName;
	}
	public void setEntityTypeName(String entityTypeName) {
		this.entityTypeName = entityTypeName;
	}
	public int getEntityTypeOrder() {
		return entityTypeOrder;
	}
	public void setEntityTypeOrder(int entityTypeOrder) {
		this.entityTypeOrder = entityTypeOrder;
	}
	public int getEntityTypeState() {
		return entityTypeState;
	}
	public void setEntityTypeState(int entityTypeState) {
		this.entityTypeState = entityTypeState;
	}
	public String getEntityTypeRemark() {
		return entityTypeRemark;
	}
	public void setEntityTypeRemark(String entityTypeRemark) {
		this.entityTypeRemark = entityTypeRemark;
	}
	
}
