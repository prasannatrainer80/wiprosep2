package com.example.demo;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;

public class ExHandling {

	@Test
	public void onErrorReturnDirectly_Mono() {
		Mono.just(2).map(i -> i/0).onErrorReturn(4).subscribe(num -> System.err.println("This is Alter Number for Arithmetic Exception  " +num));
	}
	
	@Test
	public void onErrorReturnIfArithmeticException_Mono() {
		Mono.just(2).map(i -> i/0).onErrorReturn(ArithmeticException.class,4).subscribe(x -> System.err.println("Alt Value " +x));
	}
	
	@Test
	public void OnErrorWriteInstead_Mono() {
		Mono.just(2).map(i -> i/0).onErrorReturn(error -> error instanceof ArithmeticException, 10).subscribe(x -> System.err.println("Error Instance value " +x));
	}
	
	// Example w.r.t. OnErrorResume 
	
	@Test
	public void onErrorResume_Mono() {
		Mono.just(2).map(i -> i/0).onErrorResume(error -> Mono.just(4)).subscribe(num -> System.err.println("Number error  " +num));
	}
	
	@Test
	public void onErrorResume_Ex() {
		Mono.just(2).map(i -> i/0).onErrorResume(ArithmeticException.class, error -> Mono.just(4)).subscribe(num -> System.err.println("Resume Error " +num));
	}
	
	// Example w.r.t. OnErrorContiue
	
	@Test
	public void onErrorContinue_Mono() {
		Mono.just(2).map(i -> i/0).onErrorContinue((error, obj) -> System.err.println("Error " +error + " Object " +obj))
		.subscribe(num -> System.err.println("Error  " +num));
	}
	
	@Test
	public void onErrorConue_Next() {
		int[] a = {1,4,2,5,0,22,33,21};
		for (int p : a) {
			Mono.just(2).map(i -> i/p).onErrorContinue((error, obj) -> System.err.println("Loop Error " +error + " Object " +obj))
			.subscribe(num -> System.err.println("Loop Error  " +num+ " FOr Value  " +p));
		}
	}
	
	@Test
	public void onErrorArthContinue_Next() {
		Mono.just(2).map(i -> i/0).onErrorContinue(ArithmeticException.class, (error, obj) -> System.err.println("Error  " +error + " Object " +obj))
		.subscribe(num -> System.err.println("Number  " +num));
	}
	
	@Test
	public void onErrorArthContinue_NextLoop() {
		int[] a = {1,4,2,5,0,22,33,21};
		for (int p : a) {
			Mono.just(2).map(i -> i/p).onErrorContinue(ArithmeticException.class, (error, obj) -> System.err.println("Loop Error  " +error + "Loop Object " +obj))
			.subscribe(num -> System.err.println("Loop Number  " +num));
			
		}
	}
	
	@Test
	public void doOError_Mono() {
		Mono.just(2).map(i -> i/0).doOnError(error -> System.err.println("Caught Error...")).subscribe(num -> System.err.println("Number is " +num));
	}
	
	@Test 
	public void doOnError_Mono_Loop() {
		int[] a = {1,4,2,5,0,22,33,21};
		for (int p : a) {
			Mono.just(2).map(i -> i/p).doOnError(error -> System.err.println("Caught Error Loop...")).subscribe(num -> System.err.println("Loop DoOn Number is " +num));
			
		}
	}
	
	@Test
	public void OnerrorMap_Mono() {
		Mono.just(2)
		.map(i -> i/0).onErrorMap(error -> new RuntimeException("Some Math Exception"))
		.subscribe(num -> System.err.println("There is Runtime Error Mapped " +num));
	}
}
