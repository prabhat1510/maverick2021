package service;

import dao.CalculatorDAO;

public class CalculatorServiceImpl implements CalculatorService{

    CalculatorDAO calculatorDAO;

    public CalculatorServiceImpl(CalculatorDAO calculatorDAO) {
        this.calculatorDAO = calculatorDAO;
    }

    @Override
    public int add(int num1, int num2) {
        return calculatorDAO.add(num1,num2);

    }

    @Override
    public boolean query(String query) {
        return calculatorDAO.isAvailable();
    }

    @Override
    public String toString() {
        return "Using calculator service";
    }
}
