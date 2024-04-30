import java.util.Objects;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0; // 변수값을 초기화
        double[] doubleArray = new double[10]; // while 돌고나서 저장되는 값이 인덱스 0번째에만 저장이 되니까
        int index = 0;

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = Integer.parseInt(sc.next()); // 첫 번째 정수를 전달 받아 num1 변수에 저장
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(sc.next()); // 두 번째 정수를 전달 받아 num2 변수에 저장
            System.out.print("사칙연산 기호를 입력하세요: ");
            char forchik = sc.next().charAt(0);

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

            doubleArray[index] = result; // index번째 있는 더블어레이에 결과값을 저장한다.
            index = index + 1; // index 증가

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            String text = sc.nextLine();
            if (text.equals("exit")) {
                return;
            }

        }
    }
}