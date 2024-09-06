package week04_task;

// 자바 정규 표현식 사용
// java.util.regex 패키지 안에 있는 Pattern클래스와 Matcher클래스를 주로 사용

import java.util.regex.Pattern;

public class Parser {
    // 정규 표현식
    //"^[0-9]*$" : 숫자 ,  "[+\\-*/]" : 특정 문자
    private static final String OPERATION_REG = "[+\\-*/]"; // 이 문자만
    private static final String NUMBER_REG = "^[0-9]*$"; //숫자만

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception  {
        // matches(정규표현식, 검증 대상 문자열) 일치하면 T 아니면 F
        // throw,throws

        // 구현 1.
        // 1-1. 올바른 정수 아니면 예외처리 함
        boolean regex = Pattern.matches(NUMBER_REG, firstInput);
        if (regex == false) {
            throw new BadInputException("정수값"); //type = "정수값"
        }
        //1-2. true이면 문자열 -> 정수 변환 후 calculator 객체의  firstNumber 설정
        //Integer.parseInt():문자열을 정수로 변환하는 데 사용되는 메서드
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this; //Parser 객체 자체를 반환
    }

    public Parser parseSecondNum(String secondInput) throws Exception  {
        // 구현 1.
        // 1-1. 올바른 정수 아니면 예외처리 함
        boolean regex = Pattern.matches(NUMBER_REG,secondInput);
        if(regex == false) {
            throw new BadInputException("정수값");
        }
        //1-2. true이면 문자열 -> 정수 변환 후 calculator 객체의  firstNumber 설정
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception{
        // 구현 1.
        // 1-1. 올바른 정수 아니면 예외처리 함
        boolean regex = Pattern.matches(OPERATION_REG,operationInput);
        if(regex == false){
            throw new BadInputException("연산자");
        }
        //1-2. true이면 각 연산 기호에 따라
        switch(operationInput){
            case "+":
                this.calculator.setOperation(new AddOperation());
                break;
            case "-":
                this.calculator.setOperation(new SubstractOperation());
                break;
            case "*":
                this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                this.calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}