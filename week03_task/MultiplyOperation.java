package task.chap03_task;

// 곱셈
public class MultiplyOperation extends AbstractOperation{//AbstractOperation 클래스를 상속 받음
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
//    public double operate(int firstNumber, int secondNumber){
//        return  firstNumber * secondNumber;
//    }
}
