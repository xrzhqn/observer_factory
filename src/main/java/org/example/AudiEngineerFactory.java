package org.example;

public class AudiEngineerFactory implements EngineerFactory{
    @Override
    public Engineer trainEngineer() {
        return new AudiEngineer();
    }
}
