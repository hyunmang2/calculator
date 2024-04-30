public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

    public double calculate(int num1, int num2, char operation) throws ArithmeticException { // 매개변수
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') { //연산자가 아닌 것을 입력했을 때
            throw new ArithmeticException("연산자를 입력해주세요"); // ??????????????????
        } double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
           result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
            if (num2 == 0) {
                throw new ArithmeticException("연산자를 입력해주세요");
            }
        }
        return result;
    }
}