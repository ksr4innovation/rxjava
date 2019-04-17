package com.snkit.rxjava.rxjavalearning;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class StockServer {
	
	
	public static Observable<Emp> feed(List<String> symbols) {
		
		System.out.println("   From Obserable feed method======= ");
		return Observable.create(emitter -> getEmp(emitter));
	}
	
	public static void getEmp(ObservableEmitter<Emp> emitter) {
		System.out.println("   From   ObservableEmitter method======= ");
		
		
		for (int i =0;i<20;i++) {
			Emp e=	new Emp();
			e.setName(i+"name");

			e.setPrice(i+"0");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("   From   ObservableEmitter before emit======= ");
			emitter.onNext(e);
		
		}
	}

}
