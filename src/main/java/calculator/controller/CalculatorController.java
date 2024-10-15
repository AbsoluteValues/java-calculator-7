package calculator.controller;

import calculator.service.CalculatorService;

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void execute() {
        calculatorService.printPrompt();
        String rawInput = calculatorService.inputString();
        String[] paredInput = calculatorService.parsingInput(rawInput);
//        int result = calculatorService.validateInput(paredInput);
//        if (result != 1) {
//            throw new IllegalArgumentException("잘못된 입력()");
//        }
//        calculatorService.calculate(input);
    }
}
