package week04_task;

// 추상화 : 객체에서 공통된 부분들을 모아 상위 개념으로 새롭게 선언
// abstract : 추상화임을 의미

//추상 메소드는 메소드의 몸체(구현 내용)가 없음 이 클래스를 상속받는 클래스에서 반드시 구현 해야함

public abstract class AbstractOperation { // AbstractOperation 추상 클래스
    public abstract double operate(int firstNumber, int secondNumber);  // 추상 메소드
}
