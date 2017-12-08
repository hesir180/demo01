package com.czwj.domain;

public class Energy_Settings {
	private int id;
	private String energyId;
	private String energyCode;
	private String energyName;
	private String parentId;
	private String energyUnit;
	private double energyPrice;
	private double energySharePrice;
	private int settlementDay;
	private int settlementHour;
	private double taxRate;
	private double standardCoal_Coefficient;
	private double CO2_Coefficient;
	private String useFormula;
	private String energyState;
	private String level;
	private String energySourceClass;
	private String remark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnergyId() {
		return energyId;
	}
	public void setEnergyId(String energyId) {
		this.energyId = energyId;
	}
	public String getEnergyCode() {
		return energyCode;
	}
	public void setEnergyCode(String energyCode) {
		this.energyCode = energyCode;
	}
	public String getEnergyName() {
		return energyName;
	}
	public void setEnergyName(String energyName) {
		this.energyName = energyName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getEnergyUnit() {
		return energyUnit;
	}
	public void setEnergyUnit(String energyUnit) {
		this.energyUnit = energyUnit;
	}
	public double getEnergyPrice() {
		return energyPrice;
	}
	public void setEnergyPrice(double energyPrice) {
		this.energyPrice = energyPrice;
	}
	public double getEnergySharePrice() {
		return energySharePrice;
	}
	public void setEnergySharePrice(double energySharePrice) {
		this.energySharePrice = energySharePrice;
	}
	public int getSettlementDay() {
		return settlementDay;
	}
	public void setSettlementDay(int settlementDay) {
		this.settlementDay = settlementDay;
	}
	public int getSettlementHour() {
		return settlementHour;
	}
	public void setSettlementHour(int settlementHour) {
		this.settlementHour = settlementHour;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getStandardCoal_Coefficient() {
		return standardCoal_Coefficient;
	}
	public void setStandardCoal_Coefficient(double standardCoal_Coefficient) {
		this.standardCoal_Coefficient = standardCoal_Coefficient;
	}
	public double getCO2_Coefficient() {
		return CO2_Coefficient;
	}
	public void setCO2_Coefficient(double cO2_Coefficient) {
		CO2_Coefficient = cO2_Coefficient;
	}
	public String getUseFormula() {
		return useFormula;
	}
	public void setUseFormula(String useFormula) {
		this.useFormula = useFormula;
	}
	public String getEnergyState() {
		return energyState;
	}
	public void setEnergyState(String energyState) {
		this.energyState = energyState;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getEnergySourceClass() {
		return energySourceClass;
	}
	public void setEnergySourceClass(String energySourceClass) {
		this.energySourceClass = energySourceClass;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
