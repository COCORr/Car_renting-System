package com.huawei.classroom.student.manage;
import java.util.Scanner;

import com.huawei.classroom.student.cars.MotoVehicle;

/**
 * 汽车租赁管理
 */
public class RentMgrSys {
	
	private static MotoVehicle motor;
	private static double rentCost;
	public static double getRentCost() {
		return rentCost;
	}

	public static void setRentCost(double cost) {
		rentCost = cost;
	}

	public static MotoVehicle getMotor() {
		return motor;
	}

	public static void setMotor(MotoVehicle motorObject) {
		motor = motorObject;
	}

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		MotoOperation motoMgr=new MotoOperation();
		MotoVehicle moto=null;//汽车
		System.out.println("***********欢迎光临腾飞汽车租赁公司***********");
		System.out.println("1、轿车 \t2、客车");		
		System.out.print("请选择你要租赁的汽车类型：");		
		int choose=input.nextInt();
		System.out.print("请输入您要租赁的天数：");
		int days=input.nextInt();

		rentManage(choose, days, 100, 100, 100); // vehicleType, brandId, seatCount设置默认为100
		moto = RentMgrSys.getMotor(); // 方便测试修改重新取得moto对象
		double money = RentMgrSys.getRentCost(); // 方便测试取得租车费用信息money
		System.out.println("分配给您的汽车牌号是："+moto.getVehicleId());
		System.out.println("您需要支付的租赁费用是："+money+"元。");
	}
	
	/**
	 * 租车管理
	 * @param type
	 * @param days
	 * @param vehicleType
	 * @param brandId
	 * @param seatCount
	 */
	public static void rentManage(int type, int days, int vehicleType, int brandId, int seatCount) {
		MotoOperation motoMgr=new MotoOperation();
		MotoVehicle moto=null;//汽车
		String motoType=new String();
		if(type==1) {
			motoType="轿车";
		}else if (type==2){
			motoType="客车";
		}
		if (vehicleType == 100 && brandId == 100 && seatCount == 100) {
			moto=motoMgr.motoLeaseOut(motoType);
		} else {
			moto=motoMgr.motorRentCommon(motoType, vehicleType, brandId, seatCount);//获得 		
		}
		
		setMotor(moto); // 设置MotoVehicle对象
		double money=moto.calRent(days);
		setRentCost(money);
        // TODO：3 设置租赁费用setRentCost(money);
	}
	
}
