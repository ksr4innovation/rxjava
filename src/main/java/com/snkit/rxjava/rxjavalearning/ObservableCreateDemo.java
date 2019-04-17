package com.snkit.rxjava.rxjavalearning;

import io.reactivex.Observable;

public class ObservableCreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observable<Integer> obser = Observable.create( name ->{
			
			
			for (int i =0;i<50;i++) {
			//	Thread.sleep(3000);
				
				System.out.println("Before on next");
				name.onNext(i);
			}
		});
		
		
		obser.map(value -> value * 2)
		.subscribe(System.out::println);
						

	}

}
