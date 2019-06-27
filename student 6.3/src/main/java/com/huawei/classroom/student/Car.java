package com.huawei.classroom.student;

import java.util.Scanner;

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
		super(vehicleId, brand,perRent);
		this.type=type;
	}

	//TODO 3
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
		System.out.println("1.宝马\t2.别克");
		System.out.print("请选择你要租赁的轿车品牌：");
		int brandId = input.nextInt();// 轿车型号编号
		switch (brandId) {
			case 1:// 选择宝马品牌时
				this.setBrand("宝马");
				break;
			case 2:
				this.setBrand("别克");// 选择别克品牌时
				break;
			default:
				System.out.println("对不起，没有此品牌的轿车。");

		}
	}
	
}
