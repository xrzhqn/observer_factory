package org.example;

public class BMWEngineerFactory implements EngineerFactory{
    @Override
    public Engineer trainEngineer() {
        return new BMWEngineer();
    }
}
