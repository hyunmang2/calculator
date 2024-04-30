import java.util.*;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0; // 변수값을 초기화
        double[] doubleArray = new double[9]; // while 돌고나서 저장되는 값이 인덱스 0번째에만 저장이 되니까
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
//            ArrayList<Integer> intList = new ArrayList<>(); //생성자
           doubleArray[index] = result; // index번째 있는 더블어레이에 결과값을 저장한다.
            index = index + 1; // index 증가
//           intList.add(result); // 저장된 result값 받기!
            if (index > doubleArray.length-1) { // 인덱스는 0~9번까진데 배열 9번째칸 보다 인덱스가 크면
                double[] newArray = new double[10]; // 1칸씩 땡긴 값을 저장하는 배열 생성
                for (int i = 0; i < 9; i++) { // 1칸씩 이동하면서 저장? 10칸에서 한칸씩 9번땡기기
                    newArray[i] = doubleArray[i + 1]; // i번째껀 삭제 되니까
                }
                newArray[9] = result; // 인덱스 9번째 = 배열 10번칸에 새로운 결과 값을 저장
                doubleArray = newArray; // 더블어레이에 있는 값을 쓰고싶다 = 대입!
            }

            System.out.println("결과: " + result);
//            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//            sc.nextLine(); // remove 입력 전 엔터치고 넘어 가려고
//            String input = sc.nextLine(); // remove를 입력하기 위한 입력값 저장
//
//            if (input.equals("remove")) { // 만약에~ input으로 입력한 것이 remove가 맞으면 실행해라~
//                intList.remove(0); // 0번째 index 삭제!
//            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                return;
            }
        }
    }
}