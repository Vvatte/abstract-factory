package br.com.vvatte;

import br.com.vvatte.cars.*;
import br.com.vvatte.factory.*;

public class App {

    public static void main(String[] args){

        System.out.println("-----Primeiro carro-----");
        Customer customerOne = new Customer("B",true);
        Factory factoryOne = getCarFactory(customerOne);
        Car carOne = factoryOne.create(customerOne.getGradeRequest());
        carOne.startEngine();

        System.out.println("-----Segundo carro-----");
        Customer customerTwo = new Customer("A",false);
        Factory factoryTwo = getCarFactory(customerTwo);
        Car carTwo = factoryTwo.create(customerTwo.getGradeRequest());
        carTwo.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.hasCompanyContract()){
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}
