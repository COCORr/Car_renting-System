package com.huawei.classroom.student;

import java.util.Scanner;

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
		super(vehicleId, brand,perRent);
		this.seatCount=seatCount;
	}
	
	//TODO 2
	/**
	 * 计算租金
	 */
	public float calRent(int days ){
		return days*getPerRent();
	}
	/**
	 * 租车流程
	 */
	public void leaseOutFlow(){
		Scanner input = new Scanner(System.in);
		System.out.println("1.金杯\t2.金龙");
		System.out.print("请选择你要租赁的客车品牌：");
		int brandId = input.nextInt();// 轿车型号编号
		int carTypeId = 0;
		switch (brandId) {
			case 1:// 选择宝马品牌时
				this.setBrand("金杯");
				break;
			case 2:
				this.setBrand("金龙");// 选择别克品牌时

				break;
			default:
				System.out.println("对不起，没有此品牌的客车。");

		}
	}
}
