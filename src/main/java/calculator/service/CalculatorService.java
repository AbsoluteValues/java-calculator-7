package calculator.service;

import camp.nextstep.edu.missionutils.Console;

public class CalculatorService {

    public void printPrompt() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
    }

    public String inputString() {
        return Console.readLine();
    }

    public String[] parsingInput(String rawInput) {
        String[] list = rawInput.split(",|:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }

//    public int validateInput(String[] input) {
//        if (input.equals("0") || input.contains(",") || input.contains(":")) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    public void calculate(String input) {
        if (input.equals("0")) {

        }
        if (input.contains(",") || input.contains(":")) {

        }
    }


}
