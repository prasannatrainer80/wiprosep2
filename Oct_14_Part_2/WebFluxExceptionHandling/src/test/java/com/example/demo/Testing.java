package com.example.demo;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class Testing {

	
	@Test
    public void fluxErrorHandlinsg(){

        Flux<String> stringFlux = Flux.just("a","b","c")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .concatWith(Flux.just("D"))
                .onErrorResume((e) -> { // on error this block gets executed – we are returning a flux on error value
                    System.out.println(e);
                    return Flux.just("default");
                });

        StepVerifier.create(stringFlux.log())
                .expectSubscription()
                .expectNext("a","b","c")
                .expectNext("default")
                .verifyComplete();

    }
	
//	@Test
//	public void fluxErrorHandling_withRetryBackoff(){
//
//	    Flux<String> stringFlux = Flux.just("a","b","c")
//	            .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
//	            .concatWith(Flux.just("D"))
//	            .onErrorMap((e) -> new CustomException(e)).
//	            retry(5000);
//
//	    StepVerifier.create(stringFlux.log())
//	            .expectSubscription()
//	            .expectNext("a","b","c")
//	            .expectNext("a","b","c")
//	            .expectNext("a","b","c")
//	            .expectError(IllegalStateException.class)
//	            .verify();
//	}
	
	@Test
    public void fluxErrorHandling(){

        Flux<String> stringFlux = Flux.just("a","b","c")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .concatWith(Flux.just("D"))
                .onErrorResume((e) -> { // on error this block gets executed – we are returning a flux on error value
                    System.out.println(e);
                    return Flux.just("default");
                });

        StepVerifier.create(stringFlux.log())
                .expectSubscription()
                .expectNext("a","b","c")
                .expectNext("default")
                .verifyComplete();

    }
	
	@Test
    public void fluxErrorHandling_withRetry(){

        Flux<String> stringFlux = Flux.just("a","b","c")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .concatWith(Flux.just("D"))
                .onErrorMap((e) -> new CustomException(e))
                .retry(2);

        // P.s. Retry produces same stream again

        StepVerifier.create(stringFlux.log())
                .expectSubscription()
                .expectNext("a","b","c")
                .expectNext("a","b","c")
                .expectNext("a","b","c")
                .expectError(CustomException.class)
                .verify();
    }

	
	@Test
    public void fluxErrorHandling_onErrorMap(){

        Flux<String> stringFlux = Flux.just("a","b","c")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .concatWith(Flux.just("D"))
                .onErrorMap((e) -> new CustomException(e)); // here returning a simple string on any errors

        StepVerifier.create(stringFlux.log())
                .expectSubscription()
                .expectNext("a","b","c")
                .expectError(CustomException.class)
                .verify();
    }
	
	@Test
	public void fluxErrorHandling_onErrorReturn(){

	    Flux<String> stringFlux = Flux.just("a","b","c")
	            .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
	            .concatWith(Flux.just("D"))
	            .onErrorReturn("default"); // here returning a simple string on any errors

	    StepVerifier.create(stringFlux.log())
	            .expectSubscription()
	            .expectNext("a","b","c")
	            .expectNext("default")
	            .verifyComplete();
	}
}
