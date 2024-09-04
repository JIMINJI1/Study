package task.chap03_task;

public class Main {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calculator = new Calculator();

        //Calculator 클래스의 인스턴스인 calculator 객체에서 calculate 메서드를 실행
        // calculate (String operator, int firstNumber, int secondNumber )
        System.out.println(calculator.calculate("+",1,2));
        System.out.println(calculator.calculate("-",1,2));
        System.out.println(calculator.calculate("*",1,2));
        System.out.println(calculator.calculate("/",10,20));
        System.out.println(calculator.calculate("%",10,50));

    }
}
