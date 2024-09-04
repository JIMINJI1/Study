package task.chap03_task;


public class Calculator {
    public double calculate (String operator, int firstNumber, int secondNumber ) { // 매개변수로 값 받음
        // 계산 결과 값
        double answer = 0;
        // 연산자 판별 if
        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")){
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")){ //몫
            answer = firstNumber / secondNumber;
        } else if (operator.equals("%")){ //나머지
            answer= firstNumber % secondNumber;
        }
         return answer; //연산 결과값 반환
    }
}
