package com.example.RuleEngineExample.RuleEngineExample;

import com.example.RuleEngineExample.RuleEngineExample.Entity.Bicycle;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Brand;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Type;
import com.example.RuleEngineExample.RuleEngineExample.RuleEngine.Bicycle.*;
import com.example.RuleEngineExample.RuleEngineExample.RuleEngine.BicycleRuleEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuleEngineExampleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RuleEngineExampleApplication.class, args);

		BicycleRuleEngine bicycleRuleEngine = new BicycleRuleEngine();
		bicycleRuleEngine
				.registerBicycleRuleEngine(new SedonaImpl())
				.registerBicycleRuleEngine(new BianchiImpl())
				.registerBicycleRuleEngine(new MossoImpl())
				.registerBicycleRuleEngine(new GeroniImpl())
				.registerBicycleRuleEngine(new KronImpl());

		Bicycle sedonaBicycle = new Bicycle(Type.MountainBike, Brand.Sedona);
		Bicycle bianchiBicycle = new Bicycle(Type.MountainBike, Brand.Bianchi);
		Bicycle mossoBicycle = new Bicycle(Type.MountainBike, Brand.Mosso);
		Bicycle geroniBicycle = new Bicycle(Type.MountainBike, Brand.Geroni);
		Bicycle kronBicycle = new Bicycle(Type.MountainBike, Brand.Kron);
		Bicycle bicycle1 = bicycleRuleEngine.rule(geroniBicycle);
		System.out.println(bicycle1);
	}
}
