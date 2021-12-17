package com.jnit.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jnit.Bus;
import com.jnit.Car;
import com.jnit.Travel;

@Configuration

public class ApplicationBeans {
	
	@Bean(name="audi")
    public Car getCar(){
        Car c = new Car();
        c.setFuel("Petrol");
        c.setSpeed(170);
        return c;
    }
	
	@Bean(name="volvo")
    public Bus getBus(){
        Bus b = new Bus();
        b.setFuel("Deisel");
        b.setSpeed(170);
        return b;
    }
	
	@Bean(name="lotus")
    public Travel getTravel(){
		Travel t = new Travel();
        t.setVehicle(getCar());
        return t;
    }

}
