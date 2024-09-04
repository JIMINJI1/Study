package task.chap03_task;

public class Calculator {
    // 추상화 했으니 이렇게 하면됨. 아래 주석처럼 다 안해도 됨
    private AbstractOperation  operation;

//    Calculator 클래스의 생성자
//    private final AddOperation addOperation;  // AddOperation 클래스 타입의 addOperation 변수선언 AddOperation 객체를 참조 연산 수행 함
//    private final SubstractOperation substractOperation;
//    private final MultiplyOperation multiplyOperation;
//    private final DivideOperation divideOperation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
        //this -> 현재 인스턴스(객체)
//        this.addOperation = addOperation;
//        this.substractOperation = substractOperation;
//        this.multiplyOperation = multiplyOperation;
//        this.divideOperation = divideOperation;

    }

    // 사칙연산 리셋
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }



    public double calculate (int firstNumber, int secondNumber ) { // 매개변수로 값 받음
        // 계산 결과 값 저장할 변수
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);

        // 연산자에 따라 연산함
//        if(operator.equals("+")){
//            answer = addOperation.operate(firstNumber,secondNumber); //addOperation의 operate메서드 호출하여 연산함
//        } else if (operator.equals("-")){
//            answer = substractOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("*")){
//            answer = multiplyOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("/")){ //몫
//            answer = divideOperation.operate(firstNumber,secondNumber);
//        } else if (operator.equals("%")){ //나머지
//            answer= firstNumber % secondNumber;
//        }
         return answer; //연산 결과값 반환
    }
}
