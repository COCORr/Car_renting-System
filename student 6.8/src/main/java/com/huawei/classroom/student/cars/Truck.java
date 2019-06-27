package com.huawei.classroom.student.cars;

import java.util.Scanner;

/**
 * 卡车
 */
//TODO 1
public class Truck extends MotoVehicle{
	private double ton;   //吨

	public void setTon(double ton) {
		this.ton = ton;
	}
	public Truck() {

	}
	public Truck(String s,String a,int t){
		super.setVehicleId(s);
		super.setBrand(a);
		this.ton=t;
	}
	public Truck(String vehicleId, String brand, int perRent, int ton) {
		super(vehicleId, brand, perRent);
		this.ton=ton;
	}

	public double getTon() {
		return ton;
	}
	//TODO 2
	/**
	 * 重写计算租金
	 *
	 */
	public float calRent(int days) {

		return this.getPerRent() * days * (float)	ton;
	}
	/**
	 * 重写租车流程
	 */
	public void leaseOutFlow() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.解放\t2.东风");
		System.out.print("请选择你要租赁的客车品牌：");
		int busBrandId = input.nextInt();
		double seatCount = ton;
		if (busBrandId == 1) {
			this.setBrand("解放");
		} else if (busBrandId == 2) {
			this.setBrand("东风");
		} else
			System.out.println("对不起，暂时没有此品牌的客车");
		// 为了测试用例使用，调整实现逻辑
		this.rentVehicleFlow(busBrandId, seatCount);
	}


	
	/**
	 * 重写租车流程
	 * @param brandId 品牌
	 * @param ton 吨数
	 */
	public void rentVehicleFlow(int brandId, double ton) {

		if (brandId == 1) {
			this.setBrand("解放");
			this.ton=ton;
				this.setVehicleId("京GD56577"); // 设置车牌号
			this.setPerRent(800);

		} else if (brandId == 2) {
			this.setBrand("东风");
				this.setPerRent(700);
				this.ton=ton;
				this.setVehicleId("京GD53456"); // 设置车牌号
		} else
			System.out.println("对不起，暂时没有此品牌的客车"); // 客车
        // TODO 4 根据品牌：brandId，吨数：ton设置车辆的信息

	}
}
