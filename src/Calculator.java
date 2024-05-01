public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private int num1;
    private int num2;
    private char operation;

    public double calculate(int num1, int num2, char operation) throws ArithmeticException { // 매개변수


        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') { //연산자가 아닌 것을 입력했을 때
            throw new ArithmeticException("연산자를 입력해주세요");
        }
        double result = 0;
        switch (operation) { // switch문을 사용하여 연산
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
        }
        return result;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperation() {
        return operation;
    }
}