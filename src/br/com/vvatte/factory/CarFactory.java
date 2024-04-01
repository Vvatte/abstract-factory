package br.com.vvatte.factory;

import br.com.vvatte.cars.*;

public class CarFactory extends Factory{

    @Override
    Car retriveCar(String requestedGrade) {
        if(requestedGrade.equals("A")){
            return new Ferrari(1200, "full", "orange");
        } else if (requestedGrade.equals("B")) {
            return new Volvo(1000, "full", "grey");
        } else {
            System.out.println("The requested car was unfortunately not available.");
            return null;
        }
    }
}
