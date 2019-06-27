package com.huawei.classroom.student;

/**
 * 客车
 */
public class Bus extends MotoVehicle {
	private int seatCount;//座位数

	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public Bus(){
		
	}
	public Bus(String vehicleId, String brand,int perRent,int seatCount){
		super(vehicleId, brand, perRent);
		
		
		this.seatCount=seatCount;
	}
}
