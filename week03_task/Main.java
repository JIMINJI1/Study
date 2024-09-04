package task.chap03_task;

public class Main {
    public static void main(String[] args) {
        // Calculator 객체 생성
        // Calculator 객체를 생성하면서 네 개(의 연산 객체를 주입 new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation())
        // 추상화 해서 1개만 넣으면 됨

        // 더하기
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(1,2)); //3
        System.out.println(calculator.calculate(10,20)); //30
        System.out.println();

        //빼기
        calculator.setOperation(new SubstractOperation()); // 현재 연산을 리셋하고 곱셈 연산으로 설정
        System.out.println(calculator.calculate(30,20)); //10
        System.out.println();

        // 곱하기
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10,20)); //200
        System.out.println();
        // 나누기
        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(20,10)); //2
        System.out.println();

    }
}
