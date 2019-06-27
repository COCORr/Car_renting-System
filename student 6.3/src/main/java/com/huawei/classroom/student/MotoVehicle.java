package com.huawei.classroom.student;

import java.util.Scanner;

/**
 * 汽车
 */
public abstract class MotoVehicle {
	private String vehicleId;//车牌号
	private String brand;//品牌
	private int perRent;//日租金
	
	//TODO 1  
	//计算租金：calRent      租车流程：leaseOutFlow
	public float calRent(int days ){
	    return days*getPerRent();
    }
	public void leaseOutFlow(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.解放\t2.东风");
        System.out.print("请选择你要租赁的卡车品牌：");
        int brandId = input.nextInt();// 轿车型号编号
        switch (brandId) {
            case 1:// 选择宝马品牌时
                this.setBrand("解放");
                break;
            case 2:
                this.setBrand("东风");// 选择别克品牌时
                // 为了测试用例使用，调整实现逻辑
                break;
            default:
                System.out.println("对不起，没有此品牌的卡车。");

        }
    }

	public MotoVehicle(){
		
	}
	
	public MotoVehicle(String vehicleId, String brand,int perRent) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.perRent=perRent;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
}
