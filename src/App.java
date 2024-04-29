import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫 번째 정수를 전달 받아 num1 변수에 저장
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두 번째 정수를 전달 받아 num2 변수에 저장
        System.out.print("사칙연산 기호를 입력하세요: ");
        char forchik = sc.next().charAt(0);

        int result = 0; // 변수값을 초기화

        switch (forchik) { // switch문을 사용하여 연산
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
        System.out.println("결과: " + result);
    }
}