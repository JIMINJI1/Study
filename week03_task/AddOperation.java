package task.chap03_task;

// 덧셈
public class AddOperation extends AbstractOperation {//AddOperation 클래스가 AbstractOperation 클래스를 상속 받음
    @Override // 오버라이드(재정의)
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }

//    public double operate(int firstNumber, int secondNumber){
//        return  firstNumber + secondNumber;
//    }

}
