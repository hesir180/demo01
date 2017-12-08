package com.czwj.domain;

public class Entity {
	private int id;
	private String entityId;
	private String entityCode;
	private String entityName;
	private String entityParentCode;
	private int entityIsParent;
	private int entityLevel;
	private int entityOrder;
	private int entityState;
	private String entityRemark;
	private String entityType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getEntityCode() {
		return entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEntityParentCode() {
		return entityParentCode;
	}
	public void setEntityParentCode(String entityParentCode) {
		this.entityParentCode = entityParentCode;
	}
	public int getEntityIsParent() {
		return entityIsParent;
	}
	public void setEntityIsParent(int entityIsParent) {
		this.entityIsParent = entityIsParent;
	}
	public int getEntityLevel() {
		return entityLevel;
	}
	public void setEntityLevel(int entityLevel) {
		this.entityLevel = entityLevel;
	}
	public int getEntityOrder() {
		return entityOrder;
	}
	public void setEntityOrder(int entityOrder) {
		this.entityOrder = entityOrder;
	}
	public int getEntityState() {
		return entityState;
	}
	public void setEntityState(int entityState) {
		this.entityState = entityState;
	}
	public String getEntityRemark() {
		return entityRemark;
	}
	public void setEntityRemark(String entityRemark) {
		this.entityRemark = entityRemark;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
}
