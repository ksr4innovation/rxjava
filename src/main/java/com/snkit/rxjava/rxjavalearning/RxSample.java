package com.snkit.rxjava.rxjavalearning;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class RxSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] symbols = {"ABC","BBC","XYZ"};
		List<String>  symbolesList = Arrays.asList(symbols);
		Observable<Emp> employee =	StockServer.feed(symbolesList);
		employee.filter(emp -> emp.getName().contains("5")	)
		
		.subscribe(emp -> System.out.println(" from subscribe value "+emp));
		
		
	}

}
