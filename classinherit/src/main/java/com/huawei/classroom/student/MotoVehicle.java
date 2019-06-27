package com.huawei.classroom.student;

/**
 * 汽车抽象类
 */
public abstract class MotoVehicle {
	private String vehicleId;//车牌号
	private String brand;//品牌
	private int perRent;//日租金

	//TODO:完成get/set方法
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public int getPerRent() {
		return perRent;
	}
}

