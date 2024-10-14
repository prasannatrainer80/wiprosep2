package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

@SpringBootTest
class WebFluxStudentUnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testFlux1() {
		Flux.empty();
	}
	
	@Test
	public void testFlux2() {
		Flux<String> flux = Flux.just("Spring Reactive Programming");
		flux.subscribe(System.out::println);
	}
	
	@Test
	public void testFlux3() {
		Flux<String> flux = Flux.just("Archana","Subbarayudu","Kshama");
		flux.subscribe(System.out::println);
	}

	@Test
	public void testFlux4() {
		Flux<String> flux = Flux.fromArray(new String[] {"Kalpana","Deepthi","Nikhita"});
		flux.subscribe(System.out::println);
	}
	
	@Test
	public void testFlux5() {
		List<String> names = Arrays.asList("Kalpana","Deepthi","Nikhita");
		Flux<String> flux = Flux.fromIterable(names).concatWith(Flux.just("Archana","Subbarayudu","Kshama"));
		flux.subscribe(System.out::println);
	}
	
	@Test
	public void testFluxs1() {
		Flux<String> flux = Flux.just("Archana","Subbarayudu","Kshama");
		StepVerifier.create(flux.log()).expectNext("Archana").expectNext("Subbarayudu").expectNext("Kshama").verifyComplete();
	}
	
	@Test
	public void testFluxs2() {
		Flux<String> flux = Flux.just("Archana","Subbarayudu","Kshama");
		StepVerifier.create(flux.log()).expectNextCount(3);
	}
	
	List<String> cities = Arrays.asList("Chennai","Pune","Mumbai","Kolkatha");
	
	@Test
	public void testFilter1() {
		Flux<String> cityFlux = Flux.fromIterable(cities);
		Flux<String> filterd = cityFlux.filter(city -> city.length() > 7);
		StepVerifier.create(filterd.log()).expectNext("Kolkatha").verifyComplete();
	}
	
	@Test
	public void testFilter2() {
		Flux<String> cityFlux = Flux.fromIterable(cities);
		Flux<String> filterd = cityFlux.filter(city -> city.startsWith("P"));
		StepVerifier.create(filterd.log()).expectNext("Pune").verifyComplete();
	}
	
	@Test
	public void testFilter3() {
		Flux<String> cityFlux = Flux.fromIterable(cities);
		Flux<String> filterd = cityFlux.filter(city -> city.contentEquals("Mumbai"));
		StepVerifier.create(filterd.log()).expectNext("Mumbai").verifyComplete();
	}
	
	@Test
	public void testFilter4() {
		Flux<String> cityFlux = Flux.fromIterable(cities);
		Flux<String> filterd = cityFlux.filter(city -> city.endsWith("i"));
		StepVerifier.create(filterd.log()).expectNextCount(2).verifyComplete();
	}
	
	@Test
	public void testFilter5() {
		Flux<String> cityFlux = Flux.fromIterable(cities);
		Flux<String> filterd = cityFlux.filter(city -> city.isEmpty());
		StepVerifier.create(filterd.log()).expectNext().verifyComplete();
	}
	
	@Test
	public void testMap1() {
		Flux<String> flux = Flux.just("Archana","Subbarayudu","Kshama");
		flux = flux.map(String::toUpperCase);
		StepVerifier.create(flux).expectNext("ARCHANA","SUBBARAYUDU","KSHAMA").verifyComplete();
	}
	
	private Mono<String> showEmployDetails(String id) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Vipul");
		map.put("2", "Deepthi");
		map.put("3", "Raj Narayana");
		map.put("4", "Subbarayudu");
		map.put("5", "Simran");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Mono.just(map.getOrDefault(id, "Not Found"));
	}
	
	@Test
	public void testEmployData() {
		List<String> listEmpId = Arrays.asList("1","2","3","4","5");
		Flux<String> flux = Flux.fromIterable(listEmpId).flatMap(id -> showEmployDetails(id)).log();
		StepVerifier.create(flux).expectNextCount(5).verifyComplete();
	}
	
	@Test
	public void testMergeData() {
		Flux<String> list1 = Flux.just("Archana","Subbarayudu","Kshama");
		Flux<String> list2 = Flux.just("Kalpana","Deepthi","Nikhitha");
		Flux<String> combined = Flux.merge(list1, list2);
		StepVerifier.create(combined.log()).expectNextCount(6).verifyComplete();
	}
	
	@Test
	public void testContactData() {
		Flux<String> list1 = Flux.just("Archana","Subbarayudu","Kshama");
		Flux<String> list2 = Flux.just("Kalpana","Deepthi","Nikhitha");
		Flux<String> combined = Flux.concat(list1, list2);
		StepVerifier.create(combined.log()).expectNext("Archana","Subbarayudu","Kshama","Kalpana","Deepthi","Nikhitha").verifyComplete();
	}
	
	@Test
	public void testTuple2() {
		Flux<String> list1 = Flux.just("Archana","Subbarayudu","Kshama");
		Flux<String> list2 = Flux.just("Kalpana","Deepthi","Nikhitha");
		Flux<Tuple2<String,String>> zip = list1.zipWith(list2);
		StepVerifier.create(zip.log()).expectNextCount(3).verifyComplete();
	}
}
