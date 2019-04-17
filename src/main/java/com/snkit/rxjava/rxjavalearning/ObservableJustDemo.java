package com.snkit.rxjava.rxjavalearning;

import io.reactivex.Observable;

public class ObservableJustDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observable<String> obser = Observable.just("Sairam","ramsai","sai","nehal","Krithik");
				
			obser.subscribe(name ->  {
				System.out.println(name);
			});
			
			
			Observable<String> ob = Observable.just("Sairam","ramsai","sai","nehal","Krithik");
			
			ob.subscribe(System.out::println);
		
	}

}
