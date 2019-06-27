package com.huawei.classroom.student;
/**
 * 轿车
 */
public class Car extends MotoVehicle {
	private String type;//型号
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car(){
		
	}
	public Car(String vehicleId, String brand, String type,int perRent){
		super(vehicleId, brand, perRent);
		
		this.type=type;
	}
}
