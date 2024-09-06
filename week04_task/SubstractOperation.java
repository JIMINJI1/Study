package week04_task;

// 뺄셈
public class SubstractOperation extends AbstractOperation{
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    } //AbstractOperation 클래스를 상속 받음
}
