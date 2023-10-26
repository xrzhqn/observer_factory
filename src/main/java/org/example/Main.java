package org.example;

public class Main {
    public static void main(String[] args) {
        EngineerFactory engineerFactory = new BMWEngineerFactory();
        Engineer engineer = engineerFactory.trainEngineer();

        engineer.assembleCar();
    }

    static EngineerFactory trainEngineerByCompany(String company){
        if(company.equalsIgnoreCase("Audi")) {
            return new AudiEngineerFactory();
        } else if (company.equalsIgnoreCase("BMW")) {
            return new BMWEngineerFactory();
        }
        else {
            throw new RuntimeException(company + " is not a company.");
        }
    }
}