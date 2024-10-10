package com.example.demo;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployService implements IEmployService {

	static Flux<Employ> employService;
	static {
		Employ e1 = new Employ(1, "Subbarayudu", 994234);
		Employ e2 = new Employ(2, "Lavanya", 98322);
		Employ e3 = new Employ(3, "Kalpana", 88322);
		Employ e4 = new Employ(4, "Vipul", 77333);
		employService = Flux.just(e1, e2, e3, e4);
	}
	
	@Override
	public Flux<Employ> showEmployDao() {
		return employService;
	}

	@Override
	public Mono<Employ> findByEmpId(int empno) {
		Employ e1 = new Employ(1, "Subbarayudu", 994234);
		Employ e2 = new Employ(2, "Lavanya", 98322);
		Employ e3 = new Employ(3, "Kalpana", 88322);
		Employ e4 = new Employ(4, "Vipul", 77333);
		
		Mono<Employ> result =null;
		
		if (empno==1) {
			result = Mono.just(e1);
		} else if (empno==2) {
			result = Mono.just(e2);
		} else if (empno==3) {
			result = Mono.just(e3);
		} else if (empno == 4) {
			result = Mono.just(e4);
		}
		return result;
	}

}
