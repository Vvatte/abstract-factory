package br.com.vvatte.factory;

import br.com.vvatte.cars.Bmw;
import br.com.vvatte.cars.Car;
import br.com.vvatte.cars.Tesla;
import br.com.vvatte.factory.Factory;

public class CompanyCarFactory extends Factory {
    @Override
    Car retriveCar(String requestedGrade) {
        if(requestedGrade.equals("A")){
            return new Tesla(1200, "full", "black");
        } else if (requestedGrade.equals("B")) {
            return new Bmw(1000, "full", "blue");
        } else {
            System.out.println("The requested car was unfortunately not available.");
            return null;
        }
    }
}
