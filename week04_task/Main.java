package week04_task;

public class Main {
    public static void main(String[] args) {
        // 처음에 F임(while문 반복 안돔)
        boolean calculateEnded = false;

        // 구현 2. calculateEnded = true 일때 까지 반복
        // 처음에 !(f) => T라서 반목문 실행함
        // CalculatorApp.start()에서 연산 끝나면 true return 하기 때문에 !(turn)는 false라서 반복문 멈춤
        while(!calculateEnded) {
            try{
                // try : 일단 ~~ 해라  = >  일단 CalculatorApp.start(); 실행
                calculateEnded = CalculatorApp.start();
                // catch :  예외발생하면 잡아서  => 에러메세지 보낸다 e(error)
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}

