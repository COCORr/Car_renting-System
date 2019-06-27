package com.huawei.classroom.student.manage;

import com.huawei.classroom.student.cars.Bus;
import com.huawei.classroom.student.cars.Car;
import com.huawei.classroom.student.cars.MotoVehicle;

/**
 * 汽车业务
 */
public class MotoOperation {	
	/**
	 * 租赁汽车 
	 * @param motoType 汽车类型
	 * @return 汽车
	 */
	public MotoVehicle motoLeaseOut(String motoType){
		
		return motorRentCommon(motoType, 0, 0, 0);
	}
	
		/**
	 * 租赁汽车 
	 * @param motoType 汽车类型
	 * @return 汽车
	 */
	public MotoVehicle motorRentCommon(String motoType, int brandId, int typeId, int seatCount){
		MotoVehicle moto=null;
		if(motoType.equals("轿车")){//如果选择租赁类型是轿车
			
			moto=new Car();
			if (brandId == 0 && typeId == 0 && seatCount == 0) {
				moto.leaseOutFlow();
			} else {
				((Car) moto).rentVehicleFlow(brandId, typeId); //调用轿车租赁流程的方法
			}
			
		}else if(motoType.equals("客车")){//如果选择租赁类型是客车
			moto=new Bus();
			if (brandId == 0 && typeId == 0 && seatCount == 0) {
				moto.leaseOutFlow();
			} else {
				((Bus) moto).rentBusFlow(brandId, seatCount); //调用客车租赁流程的方法
			}
			
		}
		return moto;//返回一个汽车对象
	}
}
